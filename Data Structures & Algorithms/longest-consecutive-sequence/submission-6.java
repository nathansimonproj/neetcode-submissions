class Solution {
    public int longestConsecutive(int[] nums) {
        

        // for each num find the start of the seqeuence
        // if start {
        //     iterate through
        // }
        // else {
        //     continue
        // }


        //add all elements to a set
        Set<Integer> s = new HashSet();
        for(int i : nums) {
            s.add(i);
        }

        int max = 0;

        //loop through each number in nums
        for(int i : nums) {

            //check whether its the start of a sequence
            if(s.contains(i-1)) {
                //not the start of a sequence
                continue;
            }

            //is the start of a sequence
            else {

                //set the number we are looking for
                int target = i+1;

                //initialize curr sequence length as 1
                int curr = 1;

                //if s has target val incrememnt target and curr seq length
                while(s.contains(target)) {
                    curr++;
                    target++;
                }

                //escaped loop, check if seq length > max
                max = Math.max(max, curr);
            }
        }

        return max;
    }
}
