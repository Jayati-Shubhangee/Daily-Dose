class Solution {
    public int characterReplacement(String s, int k) {
       //sliding window approach 
       int l=0;
       int r=0;
       int maxlen=0;
       int maxfreq=0;
       //making a map
       HashMap<Character, Integer> map = new HashMap<>();
       while(r<s.length()) {
        map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
        //checking for validity
        //finding max freq cha r from map
        maxfreq=Math.max(maxfreq,map.get(s.charAt(r)));
        if((r-l+1)-maxfreq <=k){
            maxlen=Math.max(maxlen,r-l+1);
        }
        else{
            map.put(s.charAt(l),map.get(s.charAt(l))-1);
            l++;
        }
        r++;
       }
       return maxlen;
    }
}