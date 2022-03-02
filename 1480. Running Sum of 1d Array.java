class Solution {
    public int[] runningSum(int[] nums) {
        int add = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = nums[i];
            nums[i] += add;
            add += temp;
        }
        
        return nums;
    }
}