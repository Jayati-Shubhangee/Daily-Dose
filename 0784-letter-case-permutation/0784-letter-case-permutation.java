class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        solve(s, "", result);
        return result;
    }

    private void solve(String ip, String op, List<String> result) {
        // base case
        if (ip.length() == 0) {
            result.add(op);
            return;
        }

        // take first character from input
        char ch = ip.charAt(0);
        String rest = ip.substring(1);

        // if alphabet
        if (Character.isLetter(ch)) {
            // branch 1 → lowercase
            String op1 = op + Character.toLowerCase(ch);
            solve(rest, op1, result);

            // branch 2 → uppercase
            String op2 = op + Character.toUpperCase(ch);
            solve(rest, op2, result);
        } 
        else {
            // digit → only one branch
            String opDigit = op + ch;
            solve(rest, opDigit, result); 
    }
}
}