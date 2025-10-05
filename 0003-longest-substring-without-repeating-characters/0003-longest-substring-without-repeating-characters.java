class Solution {
    public int lengthOfLongestSubstring(String s) {
     /* int Longest= Integer.MIN_VALUE;
      int n= s.length();
      if(n==0){
        return 0;
      }
      ArrayList<String> substrings= new ArrayList<>();
      //generating all the susbtrings
      for(int i=0;i<n;i++){
        for(int j=i+1;j<=n;j++){
            substrings.add(s.substring(i,j));
        }
      }
      //now traversing the arraylist and check the frequency of charachter for each susbtring 
    
   for (String sub : substrings) {
    HashSet<Character> unisub = new HashSet<>();
    boolean isunique = true;

    for (char ch : sub.toCharArray()) {
        if (unisub.contains(ch)) {
            isunique = false;
            break;
        }
        unisub.add(ch);
    }

    if (isunique) {
        Longest = Math.max(Longest, sub.length());
    }
}
return Longest;*/
int left = 0;
int right = 0;
int maxLength = 0;
HashSet<Character> set = new HashSet<>();

while (right < s.length()) {
    char ch = s.charAt(right);
    
    if (!set.contains(ch)) {
        set.add(ch);
        maxLength = Math.max(maxLength, set.size());
        right++;
    } else {
        // duplicate found → shrink window
        set.remove(s.charAt(left));
        left++;
    }
}
return maxLength;
   }
}