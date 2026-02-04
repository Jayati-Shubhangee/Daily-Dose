class Solution {
    public int longestOnes(int[] nums, int k) {
       int i=0;
       int j=0;
       //int count1=0;
       int max1=0;
       while(i<nums.length) {
        j=i;
        int zerocount=0;
        int count1=0;
        while(zerocount<=k && j<nums.length){
            if(nums[j]==0){
                zerocount++;
            
            }
            if(zerocount<=k){
                count1++;
            }
            j++;
        }
         max1 = Math.max(max1, count1);

            i++;
       }
       return max1;
    }
}