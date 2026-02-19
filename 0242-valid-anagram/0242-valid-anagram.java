class Solution {
    public boolean isAnagram(String s, String t) {
        //edege cases if string length not equal then 
        if(s.length()!=t.length()){
            return false;
        }
        else{
            //my first approach 
            //convert both s and t to char array 
          /* char [] s1= s.toCharArray();
            char [] t1=t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
        for(int i=0 ,j=0; i<s1.length && j<t1.length; i++, j++){
            if(s1[i]!=t1[j]){
                return false;
            }
        }
        return true;*/

        //second approach hashmap approach 
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
for(int j=0;j<t.length();j++){
    if(!map.containsKey(t.charAt(j))){
        return false;
    }
        else{
         map.put(t.charAt(j),map.getOrDefault(t.charAt(j),0)-1);
        }
    
    if(map.get(t.charAt(j))==0){
        map.remove(t.charAt(j));
    }
}
return (map.size()==0);
        }
        
    }
}