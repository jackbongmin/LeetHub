import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int lastStoneWeight(int[] stones) {
        return result(stones);
    }

    private int result(int[] InStones){

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : InStones){
            maxHeap.add(stone);
        }

        while(maxHeap.size() > 1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if(y != x){
                maxHeap.add(y-x);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();

    }

}