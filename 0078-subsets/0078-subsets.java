class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans= new ArrayList<>();
     List<Integer>input= new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        input.add(nums[i]);
     }
     solve(input,new ArrayList<>(),ans);
     return ans;
    }
    static void solve(List<Integer> input, List<Integer> output,List<List<Integer>> ans){
        if(input.size()==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        int ele= input.get(0);
        input.remove(0);
        solve(input,output,ans);
        input.add(0,ele);
        output.add(ele);
        input.remove(0);
        solve(input,output,ans);
        input.add(0,ele);
        output.remove(output.size()-1);
    }
}