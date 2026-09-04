class Solution {
    public int[] twoSum(int[] numbers, int target) {
        return result(numbers, target);
    }

    private int[] result(int[] InNumbers, int InTarget){
        int left = 0;
        int right = InNumbers.length -1;
        
        while(left<right){
            int sum = InNumbers[left] + InNumbers[right];

            if(sum == InTarget){
                return new int[]{left +1, right +1};
            }
            else if(sum < InTarget){
                left++;
            }
            else{
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}