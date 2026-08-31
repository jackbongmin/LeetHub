class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == '1'){
                    count ++;
                    sink(grid, r, c);
                }
            }
        }
        return count;
    }

    private void sink(char[][] InGrid, int InR, int InC){
        if(InR<0 || InR >= InGrid.length || InC < 0 || InC >= InGrid[0].length || InGrid[InR][InC] == '0') return;

        InGrid[InR][InC] = '0';

        sink(InGrid, InR - 1, InC);
        sink(InGrid, InR + 1, InC);
        sink(InGrid, InR, InC - 1);
        sink(InGrid, InR, InC + 1);
    }
}