class Solution {
    public int[] twoSum(int[] nums, int target) {
        return result(nums, target);
    }

    private int[] result(int[] InNums, int InTarget){
        int sum = 0;
        int num1 = 0;
        int num2 = 0;

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