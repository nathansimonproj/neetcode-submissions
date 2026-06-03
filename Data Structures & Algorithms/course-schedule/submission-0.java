class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        

        //create adj
        List<List<Integer>> adj = new ArrayList<>(); //course to its list of prereqs
        int[] inDegree = new int[numCourses];

        int completed = 0;

        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        //populate adj
        for(int[] pair : prerequisites) {
            int course = pair[0];
            int pre = pair[1];

            adj.get(pre).add(course);
            inDegree[course]++;
        }

        Queue<Integer> avail = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0) {
                avail.add(i);
            }
        }

        //bfs
        while(!avail.isEmpty()) {
            int curr = avail.poll();
            completed++;

            for(int course : adj.get(curr)) {
                inDegree[course]--;

                if(inDegree[course] == 0) {
                    avail.add(course);
                }
            }
        }

        return completed == numCourses;

    }

    /*

        create an adjacency list

        create an indegree array

        use a queue to bfs

    */
}
