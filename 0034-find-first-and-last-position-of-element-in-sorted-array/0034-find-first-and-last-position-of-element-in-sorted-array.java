class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start=0;
        int high=nums.length-1;
        int []ans= new int[2];
        ans[0]=-1;
        ans[1]=-1;
        //int found=0;
        while(start<=high){
            int mid=(start+high)/2;
            if(nums[mid]==target){
            ans[0]=mid;
            high=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            
        }
         start=0;
         high=n-1;
        while(start<=high){
            int mid=(start+high)/2;
            if(nums[mid]==target){         
            ans[1]=mid;
            start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
        }
       
return ans;
    }
}