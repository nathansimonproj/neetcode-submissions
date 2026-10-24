class Solution {

    Set<Integer> currPath = new HashSet<>();
    Map<Integer, List<Integer>> adj = new HashMap<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        

        for(int i = 0; i < numCourses; i++) {
            adj.put(i, (new ArrayList<>()));
        }

        for(int[] pair : prerequisites) {
            adj.get(pair[0]).add(pair[1]);
        }

        //course --> all the prerequisites

        for(int i = 0; i < numCourses; i++) {
            
            if(!dfs(i)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int course) {

        if(currPath.contains(course)) {
            return false;
        }

        currPath.add(course);
        for(int i : adj.get(course)) {
            if(!dfs(i)) {
                return false;
            }
        }
        adj.put(course, new ArrayList<>());
        currPath.remove(course);

        return true;

    }
}

/*

    adj list
    while dfs, create a set of what ur curr visiting, if ever on it again, return false

    return true otherwise

*/
