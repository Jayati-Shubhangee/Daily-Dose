class Solution {
    public int[] productExceptSelf(int[] nums) {
       int product=1;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];

        }

        int[] result= new int[nums.length];
        for(int i=0;i<nums.length;i++){

            if(nums[i]==0 && i==nums.length-1){
                int prod=1;
                for(int j=0;j<nums.length-1;j++){
                    prod*=nums[j];
                }
                result[i]=prod;
            
            }
            else if(nums[i]==0 && i==0){
               int prod=1;
                for(int j=1;j<nums.length;j++){
                    prod*=nums[j];
                }
                result[i]=prod;

            }
            else if(nums[i]==0 && i!=0 && i!=nums.length-1){
                int left=1;
                int right=1;
                 int prod=1;
              
                for(int j=i-1;j>=0;j--){
                    left*=nums[j];
                }
                for(int j=i+1;j<nums.length;j++){
                    right*=nums[j];
                }
                prod=left*right;
                result[i]=prod;


            }
            else{
            result[i]=product/nums[i];
            }
        }
        return result;  
    }
}