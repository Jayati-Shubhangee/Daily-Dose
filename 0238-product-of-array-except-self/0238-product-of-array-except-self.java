class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] ans = new int[nums.length];
       int prod=1;
       int n = nums.length;
      /* for(int i=0;i<n;i++){
        prod=1;
        if(i!= 0 && i!=n-1 ){
            for(int j =0 ; j<i;j++){//forward
                prod*=nums[j];
            }
             for(int j =n-1 ; j>i;j--){//backward
                prod*=nums[j];
            }
            ans[i]=prod;
        }
        else if(i==0){
            //only forward
            for(int j =1 ; j<n;j++){//forward
                prod*=nums[j];
            }
            ans[i]=prod;
        }
        else if(i==n-1){
            //only backward
            for(int j =n-2 ; j>=0;j--){
                prod*=nums[j];
            }
            ans[i]=prod;
        }
        }
        return ans;*/
// for edge case zero handlig 
//search if any zero exist
//int found=0;
int count=0;
int pos=0;
for(int i=0;i< n ;i++){
    if(nums[i]==0){
        pos=i;
       // found=1;
        count++;
    }

}

if(count>1){
    for(int i=0;i<n;i++){
        ans[i]=0;
    }
}
else if(count==1){
    for(int i=0;i<pos;i++){
        prod*=nums[i];
    }
    for(int j=n-1;j>pos;j--){
        prod*=nums[j];
    }



for(int i=0;i<n;i++){
    if(i!=pos)
    ans[i]=0;
    else{
        ans[i]=prod;
    }
}
}

 
 else{
        for(int i =0;i< n ;i++){
            prod*=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=0)
            ans[i]=prod/nums[i];
        }
       
       }
        return ans;
    }
    }
