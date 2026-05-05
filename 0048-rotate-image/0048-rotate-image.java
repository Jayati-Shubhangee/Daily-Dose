class Solution {
    public void rotate(int[][] matrix) {
//first transpose finding 
int n = matrix.length;
for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
int temp=matrix[i][j];
matrix[i][j]=matrix[j][i];
matrix[j][i]=temp;
    }
}
int start=0;
int max=n-1;

 while(start < max){
for(int i=0;i<n;i++){
   int temp= matrix[i][start];
   matrix[i][start]=matrix[i][max];
   matrix[i][max]=temp;
   
}
start++;
max--;
 }      
    }
}