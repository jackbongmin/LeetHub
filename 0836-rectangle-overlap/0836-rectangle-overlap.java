class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return result(rec1, rec2);
    }
    private boolean result(int[] InRec1, int[] InRec2){
        
        if(InRec1[2] <= InRec2[0] || 
           InRec1[0] >= InRec2[2] || 
           InRec1[3] <= InRec2[1] ||
           InRec1[1] >= InRec2[3]){  
            return false;
        }
        
        return true;
    }
}