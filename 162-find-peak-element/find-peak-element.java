class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;

        if(n == 1) {
            return 0;
        }

        if(nums[0] > nums[1]) {
            return 0;
        }

        if(nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        
        int i = 0;
        int j = nums.length - 1;

        while(i <= j) {
            int mid = i + (j - i) / 2;

            if((mid - 1 >= 0 && mid + 1 < n ) && nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            }else if(nums[mid + 1] > nums[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return -1;
    }
}

