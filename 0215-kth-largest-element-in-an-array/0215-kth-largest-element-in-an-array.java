import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        return result(nums, k);
    }

    private int result(int[] InNums, int InK){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : InNums){
            maxHeap.add(num);
        }
        for(int i = 0; i<InK-1; i++){
            maxHeap.poll();
        }

        return maxHeap.poll();
    }
}