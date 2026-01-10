class Solution {
   static void solve(int start, int count ,int n , int k, List<Integer> combo, List<List<Integer>> ans){
        //base case 1
        if(combo.size()==k){
            if(n==0)
            ans.add(new ArrayList<>(combo));
            return;
        }
        if(n<0 || start>9){
            return;
        }
        combo.add(start);
        //recursive calll
        solve(start+1, count+1,n-start,k,combo,ans);
        //backtrack removal
        combo.remove(combo.size()-1);
        //removal 
        solve(start+1,count,n,k,combo,ans);

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>() ;
       List<Integer> combo= new ArrayList<>();
       int start=1;
       int count=0;
       solve(start,count,n,k,combo,ans);
       return ans;
    }
}