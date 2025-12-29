class Solution {
    static int count=0;
    public int reversePairs(int[] nums) {
        count=0;
        mergesort(nums,0,nums.length-1);
        return count;
    }
    static void mergesort(int[]nums,int lb,int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergesort(nums,lb,mid);
            mergesort(nums,mid+1,ub);
            merge(nums,lb,mid,ub);
        }
    }
    static void merge(int[]nums,int lb,int mid,int ub){
        int n1=mid-lb+1;
        int n2=ub-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
        left[i]=nums[lb+i];
        }
        for(int j=0;j<n2;j++){
        right[j]=nums[mid+1+j];
        }
        int j = 0;
        for (int i = 0; i < n1; i++) {
            while (j < n2 && (long) left[i] > 2L * right[j]) {
                j++;
            }
            count += j;
        }
        //merging
        int i=0,k=lb;
        j=0;
        while(i< n1 && j<n2){
        
if(left[i]<= right[j]){
    nums[k++]=left[i++];
}
else{
    nums[k++]=right[j++];

}
            
        }
  while(i<n1){
            nums[k++]=left[i++];
        }
        while(j<n2){
            nums[k++]=right[j++];
        }
        }

    }