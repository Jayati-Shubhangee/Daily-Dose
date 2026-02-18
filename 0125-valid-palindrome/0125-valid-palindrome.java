class Solution {
    public boolean isPalindrome(String s) {
        //edge case 
       
        StringBuilder sb = new StringBuilder(s);
        /* if(sb.length()==1 &&  Character.isLetterOrDigit(sb.charAt(0))==false){
            return true;
        }
        else if(sb.length()==1 && Character.isLetterOrDigit(sb.charAt(0))){
            return true;
        }*/

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(Character.isUpperCase(ch)){
              sb.setCharAt(i,Character.toLowerCase(ch));
            }
             if(!Character.isLetterOrDigit(sb.charAt(i))){
               sb.deleteCharAt(i);
               i--;
            }
        }
        StringBuilder r = new StringBuilder(sb);
        r.reverse();
        String original=sb.toString();
        String rev=r.toString();
        return(original.equals(rev));
    }
}