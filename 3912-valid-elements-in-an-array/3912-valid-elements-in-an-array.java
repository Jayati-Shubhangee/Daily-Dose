class Solution {
    public List<Integer> findValidElements(int[] nums) {
       List<Integer> ans= new ArrayList<>();
       if(nums.length==1){
        ans.add(nums[0]);
        return ans;
       }
       else{
       ans.add(nums[0]);
       for(int i=1;i<nums.length-1;i++){
        int lfound=0;
        int rfound=0;
        for(int j=0;j<=i-1;j++){
if(nums[i]<=nums[j]){
    lfound=1;
  }
        }
        for(int j=i+1;j<=nums.length-1;j++){
if(nums[i]<=nums[j]){
    rfound=1;
}
        }
        if(lfound==0 || rfound==0){
        ans.add(nums[i]);
       }
       }
       
       ans.add(nums[nums.length-1]);
       return ans;
       }
    }
}