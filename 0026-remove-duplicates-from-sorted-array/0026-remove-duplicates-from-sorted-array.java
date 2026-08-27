class Solution {
    public int removeDuplicates(int[] nums) {
        
        return result(nums);
    }

    private static int result(int[] InNums){
        int pointer = 1;

        for(int i = 1; i<InNums.length; i++){
            if(InNums[i] != InNums[i-1]){
                InNums[pointer] = InNums[i];
                pointer++;
            }
        }
        return pointer;
    }
}