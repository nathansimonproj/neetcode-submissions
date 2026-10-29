class Solution {

    private Map<Integer, List<Integer>> adj;
    private Set<Integer> visit;

    public boolean validTree(int n, int[][] edges) {
        this.adj = new HashMap<>();
        this.visit = new HashSet<>();

        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        if(!dfs(0, -1)) {
            return false;
        }

        return visit.size() == n;

    }

    private boolean dfs(int node, int parent) {


        if(this.visit.contains(node)) {
            return false;
        }

        this.visit.add(node);

        for(int nei : adj.get(node)) {

            if(nei == parent) {
                continue;
            }

            if(!dfs(nei, node)) {
                return false;
            }
        }

        return true;
    }
}
