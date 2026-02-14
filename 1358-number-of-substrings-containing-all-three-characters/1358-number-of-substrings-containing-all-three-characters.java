class Solution {
    public int numberOfSubstrings(String s) {
       /* int count=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(map.size()==3){
                    count++;
                }
            }
        }
        return count;*/
        int r =0;
        int l=0;
        int count1=0;
       
        while(r< s.length()){
            count1+=r-l+1;
            r++;
            }
            r=0;
            l=0;
            int count2=0;
 HashMap<Character, Integer> map= new HashMap<>();
 while(r< s.length()){
    map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
    if(map.size()>=3){
        while(map.size()>=3){
           map.put(s.charAt(l), map.getOrDefault(s.charAt(l),0)-1);
           if(map.get(s.charAt(l))==0) {
            map.remove(s.charAt(l));
           } 
           l++;
        }

    }
    count2+=r-l+1;
    r++;
 }
 return count1-count2;
        }
    }
