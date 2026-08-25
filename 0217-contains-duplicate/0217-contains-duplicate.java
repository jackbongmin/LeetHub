import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        return result(nums);
    }

    private static boolean result(int[] nums){

        Set<Integer> s = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            if(s.contains(nums[i])){
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }
}