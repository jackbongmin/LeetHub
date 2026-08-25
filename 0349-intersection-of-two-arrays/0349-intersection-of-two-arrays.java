import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        return result(nums1, nums2);
    }

    private static int[] result(int[] InNums1, int[] InNums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0; i<InNums1.length; i++){
            set1.add(InNums1[i]);
        }

        for(int i = 0; i<InNums2.length; i++){
            if(set1.contains(InNums2[i])){
                set2.add(InNums2[i]);
            }
        }

        int[] answer = new int[set2.size()];
        int index = 0;

        for(int num : set2) answer[index++] = num;

        return answer;
    }
}