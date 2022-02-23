class Solution {
    public int removeDuplicates(int[] nums) {
        // no corner case required
        
        int index = 0;
        int result = 1;

        for(int i = 1; i < nums.length; i++){
            // found the different number
            if(nums[i] != nums[index]){ 
                // i - index > 1 means there're duplicate numbers between nums[i] and nums[index]
                if(i - index > 1){
                    nums[index + 1] = nums[i];   
                }
                
                // move the index either
                // 1. the duplicate number has been replaced, and index moved to the replaced position (new number)
                // 2. there's no duplicate number, and index moved to the position of new number
                index++;
                // add 1 as we found a new unqiue number
                result++;
            }
        }
        
        return result;
    }
}