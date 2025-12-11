class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2*nums.length];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
        }
        for(int j=nums.length;j<2*nums.length;j++) {
            ans[j] = nums[j-nums.length];
        }
        return ans;
    }
}