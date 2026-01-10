class Solution {
    static void solve(int idx, int[]nums,int target, List<Integer>combo ,List<List<Integer>> ans){
        /* if(target==0){
        List<Integer> temp= new ArrayList<>(combo);
               // normalize order
            ans.add(temp);               // HashSet removes duplicates
            return;
        }
        if(idx==nums.length || target < 0){
            return ;
        }
       
        //adding in combo
        combo.add(nums[idx]);
        //recursive call for one time addition
        solve(idx+1,nums,ans,combo,target-nums[idx]);
        //exclusion recursive call
        //bactrack and remove that 
        combo.remove(combo.size()-1);
        solve(idx+1,nums,ans,combo, target);
*/
// valid combination found
     /*   if (target == 0) {
            ans.add(new ArrayList<>(combo));
            return;
        }

        // stop recursion
        if (idx == nums.length || target < 0) return;

        // include nums[idx]
        combo.add(nums[idx]);
        solve(idx + 1, nums, target - nums[idx], combo, ans);

        // exclude nums[idx]
        combo.remove(combo.size() - 1);
        solve(idx + 1, nums, target, combo, ans);
    }*/
     

        if (target == 0) {
            ans.add(new ArrayList<>(combo));
            return;
        }

        for (int i = idx; i < nums.length; i++) {

            // skip duplicates
            if (i > idx && nums[i] == nums[i - 1])
                continue;

            // pruning
            if (nums[i] > target) break;

            combo.add(nums[i]);
            solve(i + 1, nums, target - nums[i], combo, ans);
            combo.remove(combo.size() - 1);
        }
               }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
       List<List<Integer>> ans= new ArrayList<>();
       int idx=0;
      List<Integer> combo= new ArrayList<>();
       //recursive call
       solve(idx,nums,target,combo,ans);
       return ans;
    }
}