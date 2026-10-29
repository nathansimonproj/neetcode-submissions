class Solution {

    Set<Integer> seen = new HashSet<>();
    Map<Integer, List<Integer>> adj = new HashMap();

    public int countComponents(int n, int[][] edges) {
        
        for(int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }

        for(int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        //connected adj list

        int res = 0;
        for(int i = 0; i < n; i++) {
            
            if(!seen.contains(i)) {
                res++;
                dfs(i);
            }

        }

        return res;
    }

    private void dfs(int node) {

        if(seen.contains(node)) {
            return;
        }

        seen.add(node);

        for(int nei : adj.get(node)) {

            dfs(nei);
        }
    }
}

/*

    some sort of dfs, add to smth, 

    if seen, skip

    keep a set of seen, if in the seen set, skip, 

    increment whenever !seen

*/
