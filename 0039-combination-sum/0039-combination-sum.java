class Solution {
    static void solve(int idx,int[]nums,int target,List<Integer> combo,List<List<Integer>> ans ){
        //base case 
        if(idx==nums.length || target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(combo));
            return;
        }
        //adding in combo
        combo.add(nums[idx]);
        //recursive calls applied
       // solve(idx+1,nums,target-nums[idx],combo,ans);//single add
        solve(idx,nums,target-nums[idx],combo,ans);//multiple add
        combo.remove(combo.size()-1);
        solve(idx+1,nums,target,combo,ans);//exclude
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        //recursive and backtracking approach 
        //creating a nested arraylist
        List<List<Integer>> ans= new ArrayList<>();
        int idx=0;
        List<Integer> combo= new ArrayList<>();
        //recursive call for solve 
        solve(idx,nums,target,combo,ans);
        return ans;
    }
}