class Solution {
    public String majorityFrequencyGroup(String s) {
        //charcahter frequency
        Map<Character, Integer> freq= new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        //grouping 
        Map<Integer , List<Character>> group= new HashMap<>();
        for(Map.Entry<Character,Integer>ent:freq.entrySet()){
            int f=ent.getValue();
            group.putIfAbsent(f,new ArrayList<>());
            group.get(f).add(ent.getKey());

        }

        int bestfreq=-1;
        List<Character> best= new ArrayList<>();
        for(Map.Entry<Integer,List<Character>> ent:group.entrySet()){
            int f = ent.getKey();
            List<Character> chars=ent.getValue();
            if(chars.size()>best.size()||( chars.size()==best.size() && f>bestfreq)){
best=chars;
bestfreq=f;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : best){
            sb.append(c);
        }
        return sb.toString();
    }
}