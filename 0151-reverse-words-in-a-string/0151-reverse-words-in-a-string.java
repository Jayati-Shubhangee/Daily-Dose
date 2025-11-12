class Solution {
    public String reverseWords(String s) {
       s = s.trim();
        
        // Step 2: Split the string into words using spaces, handling multiple spaces
        String[] words = s.split("\\s+");
        
        // Step 3: Reverse the words and join them with a single space
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" "); // Add space between words
            }
        }
        
        // Step 4: Return the final result
        return result.toString(); 
    }
}