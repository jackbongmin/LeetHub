class Solution {
    public int[] twoSum(int[] nums, int target) {
        return result(nums, target);
    }

    private int[] result(int[] InNums, int InTarget){

        for(int i = 0; i <InNums.length; i++){
            for(int j = i+1; j < InNums.length; j++){
                if(InNums[i] + InNums[j] == InTarget){
                    return new int[]{i, j};
                }
            }
        }
        return new int []{};
    }
}