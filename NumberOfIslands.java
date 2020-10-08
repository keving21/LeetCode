class Solution {
    public int numIslands(char[][] grid) {

        int count =0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]=='1'){
                    count++;
                    checkIsland(grid, i, j);
                }
            }
        }

        return count;
    }
    public char[][] checkIsland(char[][] grid, int x, int y){

        if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]=='1'){

            grid[x][y] = '0';
            checkIsland(grid, x-1,y);
            checkIsland(grid, x+1, y);
            checkIsland(grid, x,y-1);
            checkIsland(grid, x, y+1);
        }
        return grid;
    }
}