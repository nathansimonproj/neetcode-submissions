class Solution {

    private Map<Integer, List<Integer>> adj = new HashMap<>();
    private Set<Integer> seen = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        

        for(int i = 0; i < numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }

        for(int[] pair : prerequisites) {
            adj.get(pair[0]).add(pair[1]);
        }

        for(int i = 0; i < numCourses; i++) {

            if(!dfs(i)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int course) {


        if(this.seen.contains(course)) {
            return false;
        }

        this.seen.add(course);
        for(int n : this.adj.get(course)) {

            if(!dfs(n)) {
                return false;
            }
        }

        this.seen.remove(course);
        this.adj.put(course, new ArrayList<>());

        return true;
    }

    
}

/*

    cycle detection

    if we ever reach a node that we've visited in the current path, return false;

    once a node is finished, clear its pre reqs

*/
