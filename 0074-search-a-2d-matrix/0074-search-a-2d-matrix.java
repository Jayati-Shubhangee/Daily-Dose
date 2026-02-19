class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      //very basic brute force 
      int r = matrix.length;
      int c = matrix[0].length;
      int found=0;
      for(int i=0;i<r;i++) {
        for(int j=0;j<c;j++){
            if(matrix[i][j]==target){
                found=1;
            }
        }
      }
      return(found==1);
    }
}