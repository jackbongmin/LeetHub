import java.util.Map;
import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        return result(nums);
    }

    private static int result(int[] InNums){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i< InNums.length; i++){
            int num = InNums[i];
            int prevCount = 0;

            prevCount = map.getOrDefault(num, 0);
            count += prevCount;

            map.put(num, prevCount + 1);
        }
        return count;
    }
}