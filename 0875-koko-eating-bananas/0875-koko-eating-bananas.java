class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int ans=0;
       long anshr=0;
       int maxpile=0;
       for(int i=0;i<piles.length;i++){
maxpile=Math.max(maxpile,piles[i]);
       }
       /*for( int i=1;i<=maxpile;i++){
        anshr=0;
for(int j=0;j<piles.length;j++){
 anshr+=Math.ceilDiv(piles[j],i);
       }
       if(anshr<=h){
        ans=i;
        break;
       }
       }
return ans;*/
int low=1;
int high=maxpile;
while(low <= high){
    int mid=(low+high)/2;
    anshr=0;
   for(int j=0;j<piles.length;j++){
 anshr+=Math.ceilDiv(piles[j],mid);
       }
     if(anshr>h){
        low=mid+1;
    }
    else if(anshr<=h){
        ans=mid;
        high=mid-1;
    }
}
return ans;
    }
}