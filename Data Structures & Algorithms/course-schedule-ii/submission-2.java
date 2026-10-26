class Solution {

    List<Integer> res = new ArrayList<>();
    int idx = 0;

    boolean cycleExists = false;
    Set<Integer> cP = new HashSet<>();

    Map<Integer, List<Integer>> adj = new HashMap<>(); //course to pre reqs

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        for(int i = 0; i < numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }

        for(int[] pair : prerequisites) {

            adj.get(pair[0]).add(pair[1]);

        }

        for(int i = 0; i < numCourses; i++) {

            if(cycleExists) {
                return new int[0];
            }

            dfs(i);
        }

        int[] arr = new int[res.size()];

        for(int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }

        return arr;
        
    }

    private void dfs(int course) {

        if(cycleExists || cP.contains(course)) {
            cycleExists = true;
            return;
        }

        cP.add(course);

        for(int nei : adj.get(course)) {
            dfs(nei);
        }

        cP.remove(course);
        adj.put(course, new ArrayList<>()); 

        if(!res.contains(course)) {
            res.add(course);
        }
    }


}


/*

    once u set a course as finished, add it to the res set

    same process as prev, add to an array?

*/
