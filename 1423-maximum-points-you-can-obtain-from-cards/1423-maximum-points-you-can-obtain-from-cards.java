class Solution {
    public int maxScore(int[] nums, int k) {
     /*int ans =0;
     int n = cardPoints.length;
     int count=0;
     if(n==k){
     for(int i=0;i<n;i++){
        ans+=cardPoints[i];
     }
     }
     else{
        int i=0;
        int j=n-1;
        while(i<=j && count!=k){
            int max = Math.max(cardPoints[i],cardPoints[j]);
            ans+=max;
            i++;
            j--;
            count++;
        }
     }
     return ans;*/ // WRONG LOGIC UNDERSTOOD THE QUESTION I SOF CONTIGUOS ARRAY SUBARRAY SO SLIDING WINDOW 

     int leftsum=0;
     int maxans=0;
     int  n = nums.length;
     for(int i=0;i<k;i++){
        leftsum+=nums[i];
     }
     maxans=leftsum;
     int rightsum=0;
     for(int i=1;i<=k;i++){
        leftsum-=nums[k-i];
        rightsum+=nums[n-i];
        maxans= Math.max(maxans, leftsum+rightsum);
     }
return maxans;
    }
}