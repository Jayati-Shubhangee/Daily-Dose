class Solution {
    static void solve(int open,int close,StringBuilder op,ArrayList<String>ans){
        StringBuilder op1=new StringBuilder(op);
        StringBuilder op2=new StringBuilder(op);
        //base case
        if(open==0 && close==0){
            ans.add(op.toString());
        }
        //case 1 opening bracket is always valid brach until it becomes 0
        if(open!=0){
           // StringBuilder op1=new StringBuilder(op);
        op1.append("(");
        solve(open-1,close,op1,ans);
        }
        if(close>open){
            //StringBuilder op2=new StringBuilder(op);
            op2.append(")");
            solve(open,close-1,op2,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans= new ArrayList<>();
        int open=n;
        int close=n;
        StringBuilder op=new StringBuilder();
        solve(open,close,op,ans);
        return ans;
    }
}