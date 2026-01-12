class Solution {
    public boolean canJump(int[] nums) {
   /* boolean ans= false;
    int maxreach= 0;
    int i=0;
    while(i< nums.length){
        if(maxreach>=nums.length-1){
            ans=true;
        }
         if(i> maxreach){
            ans=false;
        }
        if(i==0 && nums[i]==0){
            return false;
        }
        if(nums.length==1){
            return true;
        }
        maxreach=Math.max(maxreach,i+nums[i]);
        i++;
    }
    return ans;*/
      int maxreach = 0;
        int i = 0;

        while (i < nums.length) {

            if (i > maxreach) return false;

            maxreach = Math.max(maxreach, i + nums[i]);

            if (maxreach >= nums.length - 1) return true;

            i++;
        }
        return true;
    }
}