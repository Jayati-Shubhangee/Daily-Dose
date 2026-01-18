class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
     //finding grid length 
     int n = grid.length;
     int[]  ans= new int[2] ;
     ArrayList<Integer> gridele= new ArrayList<>();
     for(int i=0;i<n;i++){
        for(int j=0;j<grid[i].length;j++){
            gridele.add(grid[i][j]);
        }
     }
     for(int i=1;i<=n*n;i++){
if(gridele.contains(i)==false){
    ans[1]=i;
}
     }
     HashSet<Integer> repeated= new HashSet<>();
     for(int ele:gridele){
if(repeated.contains(ele)){
    ans[0]=ele;
}
else{
    repeated.add(ele);
}
     }
     return ans;
    }
}