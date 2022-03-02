class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for(String sentence : sentences) {
            int space_num = 0;
            
            for(int i = 0; i < sentence.length(); i++){
                Character c = sentence.charAt(i);
                if(c == ' ') space_num++;
            }
            
            max = Math.max(max, space_num);
        }
        
        return max + 1;
    }
}