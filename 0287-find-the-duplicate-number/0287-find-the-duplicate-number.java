class Solution {
    public int findDuplicate(int[] nums) {
        return result(nums);
    }

    private int result(int[] InNums){
        int a = InNums[0];
        int b = InNums[0];

        // 무한루프 있는지 없는지 찾아야함 이거때매 시간초과
        while(true) {
            a = InNums[a];
            b = InNums[InNums[b]];
            if(a == b) break;       
        }

        a = InNums[0]; 
        
        while(a != b) {
            a = InNums[a];
            b = InNums[b];
            

            if(a == b) break;
        }

        return a;
    }
}

// 한칸씩 움지기는 배열
// 13 32 41 24 