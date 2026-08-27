class Solution {
    public void moveZeroes(int[] nums) {
        result(nums);
    }
    private static void result(int[] InNums){
        int pointer = 0;

        for(int i=0; i<InNums.length;i++){
            if(InNums[i] != 0){
                InNums[pointer] = InNums[i];
                pointer++;
            }
        }

        for(int i = pointer; i<InNums.length; i++){
            InNums[i] = 0;
        }
    }
}