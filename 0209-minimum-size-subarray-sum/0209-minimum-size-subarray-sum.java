class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    // int ans=0;
     int minsize=Integer.MAX_VALUE;
     /* int found=0;
     for(int i=0;i<nums.length;i++){
        //int sum=nums[i];
       int sum=0;
        for(int j=i;j<nums.length;j++){
            sum+=nums[j];
            if(sum>=target){
                found=1;
               if(j-i+1 < minsize){
                minsize=j-i+1;
               }
            }
        }
     }
     if(found==1)  {
ans=minsize;
     } 
     return ans;*/
     int left=0;
     int right=0;
     int sum=0;
     while(right<nums.length){
        sum+=nums[right];
        while(sum>=target){
            minsize=Math.min(minsize,right-left+1);
            sum-=nums[left];
            left++;
        }
        right++;
     }
      return minsize == Integer.MAX_VALUE ? 0 : minsize;
    }
}