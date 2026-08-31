class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        
        int max_sum = 0;

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == 1){
                    int sum = sink(grid, r, c);
                    if(sum > max_sum) max_sum = sum;
                }
            }
        }
        return max_sum;
    }

    private int sink(int[][] InGrid, int InR, int InC){


        if(InR<0 || InR >= InGrid.length || InC < 0 || InC >= InGrid[0].length || InGrid[InR][InC] == 0) return 0;

        InGrid[InR][InC] = 0;

        return 1 + sink(InGrid, InR - 1, InC) 
                 + sink(InGrid, InR + 1, InC)
                 + sink(InGrid, InR, InC - 1)
                 + sink(InGrid, InR, InC + 1);

    }
}