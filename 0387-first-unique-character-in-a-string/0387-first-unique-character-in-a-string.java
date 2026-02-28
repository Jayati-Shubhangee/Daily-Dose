class Solution {
    public int firstUniqChar(String s) {
      //brute force apporach 
    /*  int ans=0;
      int i=0;
      int found=0;
      for( i=0;i<s.length()-1;i++){
            found=0;
        for(int j=0;j<i;j++){
            if(s.charAt(i)==s.charAt(j)){
                found=1;
            }
        }
        for(int j=i+1;j<s.length();j++){
             if(s.charAt(i)==s.charAt(j)){
                found=1;
            }
        }
        
      }
      if(i==s.length()-1 && found==-1){
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(j)==s.charAt(i)){
                found=1;
                }
            }
      }
        if(found==0){
            ans=i;
            break;
        }
        else if(found==1){
            ans=-1;
        }
         return ans;*/
       /*   for(int i = 0; i < s.length(); i++) {

            int found = 0;

            // check left side
            for(int j = 0; j < i; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    found = 1;
                    break;
                }
            }

            // check right side only if not found yet
            if(found == 0) {
                for(int j = i + 1; j < s.length(); j++) {
                    if(s.charAt(i) == s.charAt(j)) {
                        found = 1;
                        break;
                    }
                }
            }

            if(found == 0) {
                return i;
            }
        }

        return -1;*/

        //hasmap approach 

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        Character str=' ';
        int ans=-1;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                str=entry.getKey();
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(str==s.charAt(i)){
                ans=i;
                break;
            }
        }
        return ans;
      }
     
        }

      
    