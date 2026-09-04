import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        return result(nums);
    }

    private List<List<Integer>> result(int[] InNums){
        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(InNums);
        int n = InNums.length;

        for(int i = 0; i < n - 2; i++) {
            if(InNums[i] > 0) break;

            if(i > 0 && InNums[i] == InNums[i - 1]) continue;

            if(InNums[i] + InNums[i + 1] + InNums[i + 2] > 0) break;
            
            if(InNums[i] + InNums[n - 1] + InNums[n - 2] < 0) continue;

            find(InNums, i, answer);
        }
        return answer;
        
    }

    private void find(int[] InNums, int InIndex, List<List<Integer>> InAnswer){
        int left = InIndex +1;
        int right = InNums.length - 1;
        int target = -InNums[InIndex];

        while(left < right) {
            int sum = InNums[left] + InNums[right];

            if(sum == target) {
                InAnswer.add(Arrays.asList(InNums[InIndex], InNums[left], InNums[right]));
                
                while(left < right && InNums[left] == InNums[left + 1]) left++;
                while(left < right && InNums[right] == InNums[right - 1]) right--;
                
                left++;
                right--;
            } 
            else if(sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
    }
}