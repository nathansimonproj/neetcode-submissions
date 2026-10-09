class Solution {

    //0 unvisited
    //1 visitng
    //2 cleared
    private int[] state;
    private List<List<Integer>> adj = new ArrayList<>();
    private final int UNVISITED = 0;
    private final int VISITING = 1;
    private final int CLEARED = 2;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        this.state = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] pair : prerequisites) {
            adj.get(pair[0]).add(pair[1]);
        }

        for(int c = 0; c < numCourses; c++) {
            if(!dfs(c)) {
                return false;
            }
        }

        return true;


    }

    private boolean dfs(int course) {

        if(state[course] == VISITING) {
            return false;
        }

        if(state[course] == CLEARED) {
            return true;
        }

        state[course] = VISITING;
        for(int c : adj.get(course)) {
            if(!dfs(c)) {
                return false;
            }
        }

        state[course] = CLEARED;
        return true;
    }
}
