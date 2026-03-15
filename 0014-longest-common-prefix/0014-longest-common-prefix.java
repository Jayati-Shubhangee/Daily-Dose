class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans= strs[0];
        StringBuilder sb = new StringBuilder(ans);
        for(int i=1;i<strs.length;i++){
            StringBuilder word=new StringBuilder(strs[i]);
            int j=0;
            while(j<sb.length() &&j<word.length()){
             if(sb.charAt(j)==word.charAt(j)){
                j++;
             }
             else{
                break;
             }   
            }
            sb.delete(j,sb.length());
            if(sb.length()==0){
                return "";
            }
        }
        return sb.toString();
    }
}