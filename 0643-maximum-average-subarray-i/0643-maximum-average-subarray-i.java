class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        return result(nums, k);
    }

    private double result(int[] InNums, int InK){
        double sum = 0;
        for(int i = 0; i<InK;i++){
            sum += InNums[i]; 
        }

        double max_sum = sum;

        for(int i = InK; i<InNums.length; i++){
            sum = sum + InNums[i] - InNums[i-InK];

            max_sum = Math.max(max_sum, sum); 
        }

        return max_sum / InK;

    }
}