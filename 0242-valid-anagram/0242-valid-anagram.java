class Solution {
    public boolean isAnagram(String s, String t) {
        //edege cases if string length not equal then 
        if(s.length()!=t.length()){
            return false;
        }
        else{
            //my first approach 
            //convert both s and t to char array 
           char [] s1= s.toCharArray();
            char [] t1=t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
        for(int i=0 ,j=0; i<s1.length && j<t1.length; i++, j++){
            if(s1[i]!=t1[j]){
                return false;
            }
        }
        return true;
        }
    }
}