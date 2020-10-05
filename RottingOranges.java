import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> queue = new LinkedList<>();
        List<int[]> arr = new ArrayList<int[]>();
        int count =0;
        int numPpl =0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j] == 1) {
                    numPpl ++;
                }

                else if(grid[i][j] == 2) {
                    queue.add(new int[] {i,j});
                }

            }
        }
        if(numPpl==0)return 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            if(numPpl==0){
                return count;
            }

            count++;

            for(int i=0;i<size;i++){

                int [] temp = queue.poll();
                //check left

                if(temp[0]-1>=0 && grid[temp[0]-1][temp[1]]==1){
                    grid[temp[0]-1][temp[1]] = 2;
                    queue.add(new int[] {temp[0]-1, temp[1]});
                    numPpl--;
                }
                //check right
                if(temp[0]+1<grid.length && grid[temp[0]+1][temp[1]]==1){
                    grid[temp[0]+1][temp[1]] = 2;
                    queue.add(new int[] {temp[0]+1, temp[1]});
                    numPpl--;

                }

                //check down
                if(temp[1]-1>=0 && grid[temp[0]][temp[1]-1]==1){
                    grid[temp[0]][temp[1]-1] = 2;
                    queue.add(new int[] {temp[0], temp[1]-1});
                    numPpl--;

                }

                //check up
                if(temp[1]+1<grid[0].length && grid[temp[0]][temp[1]+1]==1){
                    grid[temp[0]][temp[1]+1] = 2;
                    queue.add(new int[] {temp[0], temp[1]+1});
                    numPpl--;

                }

            }




        }



        return -1;
    }
}