class Solution {
    public void sortColors(int[] nums) {
        //calculating the frequency of 0 1 2 
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
if(nums[i]==0){
    count0 ++;
}
if(nums[i]==1){
    count1 ++;
}
if(nums[i]==2){
count2++;
}

        }
        int idx=0;
        while(idx < nums.length && count0!=0){
            nums[idx]=0;
            count0--;
            idx++;

        }
        while(idx < nums.length && count1!=0){
            nums[idx] =1;
            count1--;
            idx++;
        }
         while(idx < nums.length && count2!=0){
            nums[idx] =2;
            count2--;
            idx++;
        }

    }
}