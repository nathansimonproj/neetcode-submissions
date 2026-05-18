class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int res = 0;

        int l = 0;
        int r = 0;

        double curr = 0;

        while(r < arr.length) {

            curr += arr[r];

            if(r - l + 1 == k) {
                if(curr / k >= threshold) {
                    res++;
                }

                curr -= arr[l];
                l++;
            }

            r++;
        }

        return res;
    }
}