class Solution {
    public int maxArea(int[] height) {
        return result(height);
    }

    private int result(int[] InHeight){
        int left = 0;
        int right = InHeight.length -1;
        int max = 0;

        while(left<right){
            int currHeight = Math.min(InHeight[left], InHeight[right]);

            max = Math.max(max, currHeight * (right - left));

            while(left < right && InHeight[left] <= currHeight) {
                left++;
            }
            
            while(left < right && InHeight[right] <= currHeight) {
                right--;
            }
        }
        return max;
    }
}

// 가로는 계속 줄어듦
// 높이만 비교하면 됨?