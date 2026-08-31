import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        return result(mat);
    }
    
    private int[][] result(int[][] InMat){
        int m = InMat.length;
        int n = InMat[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(InMat[r][c] == 0){
                    queue.offer(new int[]{r, c});
                } else {
                    InMat[r][c] = -1;
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            for(int i = 0; i < 4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr < 0 || nr >= m || nc < 0 || nc >= n || InMat[nr][nc] != -1){
                    continue;
                }

                InMat[nr][nc] = InMat[r][c] + 1;
                queue.offer(new int[]{nr, nc});
            }
        }

        return InMat;
    }
}