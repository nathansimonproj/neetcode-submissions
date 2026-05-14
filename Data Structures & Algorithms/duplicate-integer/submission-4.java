class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*

            looking for duplicates
                add everything to a set, compare array length with set length
                O(n) in every case

                with each new number check whether the set contains it
                    cut runtime down

        */

        Set<Integer> seen = new HashSet<>();
        for(int i : nums) {
            if(seen.contains(i)) {
                return true;
            }
            seen.add(i);
        }

        return false;
    }
}