class Solution {
    public int[] getConcatenation(int[] nums) {
        // corner case
        if(nums == null || nums.length == 0) return nums;
        
        int[] res = new int[nums.length * 2];
        
        for(int i = 0; i < nums.length; i++){
            res[i] = nums[i];
            res[i + nums.length] = nums[i];
        }
        
        return res;
    }
}