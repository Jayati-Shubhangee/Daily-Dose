class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int idx=0;
        solve(nums,idx,new ArrayList<>(),ans);
        return ans;
    }
    public void solve(int[] nums, int idx,List<Integer> curr,List<List<Integer>>ans){
        ///base case 
        if(idx==nums.length){
            //adding answer or separte arraylist created in the final array list ans
ans.add(new ArrayList<>(curr));
return;
        }
        //pick part 
        curr.add(nums[idx]);
        solve(nums,idx+1,curr,ans );
        //backtrack
        curr.remove(curr.size()-1);
        // not pick part 
        solve(nums,idx+1,curr,ans);
    }
}