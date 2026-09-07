class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        return result(target, nums);
    }

    private int result(int InTarget, int[] InNums){
        int left = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;

        for(int right = 0; right< InNums.length; right++ ){
            sum += InNums[right];

            while(sum >= InTarget){
                length = Math.min(length, right - left + 1);
                
                sum -= InNums[left];
                left++;
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}