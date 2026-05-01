class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] answer= new int[2];
        int maxcount=0;
        int ansidx=0;
        //int found=0;
        for(int i=0;i<mat.length;i++){
            int count1=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    // found=1;
                    count1++;
                }
            }
            if(count1>maxcount ){
                maxcount=count1;
                ansidx=i;
            }            
        }
       
        
        answer[0]=ansidx;
        answer[1]=maxcount;
        return answer;
    }
}