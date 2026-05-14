class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //optimized solution

        for(int i = 0; i < matrix.length; i++) {

            if(matrix[i][matrix[i].length - 1] < target) {
                continue;
            }

            //state: know the val is in this matrix, binary search
            int[] arr = matrix[i];

            int l = 0;
            int r = arr.length - 1;

            while(l <= r) {
                int mid = l + ((r - l) / 2);

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

            return false;
        }

        return false;
    }
    
}
