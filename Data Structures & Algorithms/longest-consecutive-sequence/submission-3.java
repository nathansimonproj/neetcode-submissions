class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> s = new HashSet<>();
        for(int i: nums) {
            s.add(i);
        }

        int length = 0;
        int longest = 0;
        for(int num: s) {

            if(!s.contains(num-1)) {
                //left neighbor found
                length = 1;
                while(s.contains(num + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;

        //[2,20,4,10,3,4,5] --> 2 20 4 10 3 4 5  O(1) lookup

        /*
            
            add to set

            loop through each int in num set

                only loop on the element with no left neighbor


            
        */

    }
}
