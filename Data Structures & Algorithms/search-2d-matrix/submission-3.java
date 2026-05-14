class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //further optimized solution


        //binary search matrix --> binary search array


        int l = 0;
        int r = matrix.length - 1;

        while(l <= r) {
            int mid = l + ((r-l) / 2);

            int[] arr = matrix[mid];

            if(arr[0] < target && arr[arr.length - 1] < target) {
                l = mid + 1;
            }
            else if(arr[0] > target && arr[arr.length - 1] > target) {
                r = mid - 1;
            }

            else {
                //binary search array
                l = 0;
                r = arr.length - 1;

                while(l <= r) {
                    mid = l + ((r-l) / 2);

                    if(arr[mid] < target) {
                        l = mid + 1;
                    }
                    else if(arr[mid] > target) {
                        r = mid - 1;
                    }
                    else {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
