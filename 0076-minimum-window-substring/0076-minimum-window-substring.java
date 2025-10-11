class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for(char ch : t.toCharArray()) need.put(ch, need.getOrDefault(ch, 0)+1);

        int left = 0, right = 0, start = 0, valid = 0;
        int minLength = Integer.MAX_VALUE;

        while(right < s.length())
        {
            char c = s.charAt(right++);

            if(need.containsKey(c))
            {
                window.put(c, window.getOrDefault(c, 0)+1);
                if(window.get(c).equals(need.get(c))) valid++;
            }

            while(valid == need.size())
            {
                if(right - left < minLength)
                {
                    minLength = right - left;
                    start = left;
                }

                char d = s.charAt(left++);

                if(need.containsKey(d))
                {
                    if(window.get(d).equals(need.get(d))) valid--;

                    window.put(d, window.get(d) - 1);
                     }
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}