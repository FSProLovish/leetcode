class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        int oranges = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 2) {
                    q.offer(new int[]{i, j, 0});
                }else if(grid[i][j] == 1) {
                    oranges++;
                }
            }
        }

        int row[] = { 1, 0, -1, 0 };
        int col[] = { 0, 1, 0, -1 };

        int min = 0;

        while(!q.isEmpty()) {
            int arr[] = q.poll();
            int t = arr[2];
            min = t;

            for(int i=0;i<4;i++) {
                int nrow = arr[0] + row[i];
                int ncol = arr[1] + col[i];
                if(nrow >=0 && nrow< n && ncol>=0 && ncol< m && grid[nrow][ncol] == 1) {
                    grid[nrow][ncol] = 2;
                    oranges--;
                    q.offer(new int[]{nrow, ncol, t+1});
                }
            }
        }

        return oranges == 0 ? min : -1;
    }
}