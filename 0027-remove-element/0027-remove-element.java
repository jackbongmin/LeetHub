class Solution {
    public int removeElement(int[] nums, int val) {
        
       return result(nums, val);
    }

    private static int result(int[] InNums, int InVal){
        int pointer = 0;

        for(int i = 0; i<InNums.length; i++){
            if(InNums[i] != InVal){
                InNums[pointer] = InNums[i];
                pointer++;
            }
        }
        return pointer;
    }
}