class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map: key = sorted word, value = list of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);  // sort characters
            String key = new String(chars);  // create sorted string as key
            
            // put word into the correct group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        
        // return only the grouped values
        return new ArrayList<>(map.values());
    }   
    }