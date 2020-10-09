class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0 || matrix[0].length==0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int j=0;j<cols;j++){
            //if number is less than highest num in row, then check row.
            if(matrix[rows-1][j] >= target){
                if(matrix[rows-1][j]== target) return true;

                else{
                    for(int i=0;i<rows-1;i++){
                        if(matrix[i][j]==target)return true;
                    }
                }
            }

        }

        return false;
    }
}