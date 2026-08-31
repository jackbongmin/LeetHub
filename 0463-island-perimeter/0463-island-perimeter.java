class Solution {
    public int islandPerimeter(int[][] grid) {
        return result(grid);
    }
    private int result(int[][] InGrid){
        int answer = 0;

        for(int i = 0; i<InGrid.length; i++){
            for(int j = 0; j < InGrid[0].length; j++){
                if(InGrid[i][j] ==1) {
                    answer += 4;
                    if(i>0 && InGrid[i-1][j] ==1) answer -=2;
                    if(j> 0 && InGrid[i][j-1]==1) answer -=2;
                }
            }
        }
        return answer;
    }
}