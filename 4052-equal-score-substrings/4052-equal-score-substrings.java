class Solution {
    public boolean scoreBalance(String s) {
        int len = s.length();

        int total = 0;
        for(int i = 0; i<len; i++){
            total = total + (s.charAt(i) - 'a' + 1);
        }
        int left = 0;
        for(int i = 0; i<len-1; i++){
            left = left + (s.charAt(i) - 'a' + 1);
            if(left == total - left)return true;
        }
        return false;
    }
}