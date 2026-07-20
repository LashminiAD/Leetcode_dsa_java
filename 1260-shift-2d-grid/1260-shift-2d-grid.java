class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;
        int total = r*c;
        k %= total;

        int []arr = new int[total];
        for(int i = 0; i<r; i++){
            for(int j =0; j<c; j++){
                int idx = i*c+j;
                arr[idx] = grid[i][j];
            }
        }

        int shift[] = new int[total];
        for(int i =0; i<total; i++){
            int newIndex = (i+k)%total;
            shift[newIndex] = arr[i];
        }

        int[][]ans = new int[r][c];
        for(int i=0; i<total; i++){
            int newR = i/c;
            int newC = i%c;
            ans[newR][newC] = shift[i];
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int i =0; i<r; i++){
            List<Integer> row = new ArrayList<>();
            for(int j =0; j<c; j++){
                row.add(ans[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}