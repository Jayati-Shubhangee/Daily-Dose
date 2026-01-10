class Solution {
    static void solve(int start, int idx,int n , int k, List<Integer> combo, List<List<Integer>> ans){
        //base case
        if(combo.size()==k){
            ans.add(new ArrayList<>(combo));
            return;
        }
        if(start > n) return ;
        combo.add(start);
        //recursive calll
        solve(start+1, idx+1,n,k,combo,ans);
        //backtrack removal
        combo.remove(combo.size()-1);
        //removal 
        solve(start+1,idx,n,k,combo,ans);

    }
    public List<List<Integer>> combine(int n, int k) {
       List<List<Integer>> ans= new ArrayList<>() ;
       List<Integer> combo= new ArrayList<>();
       int start=1;
       int idx=0;
       solve(start,idx,n,k,combo,ans);
       return ans;

    }
}