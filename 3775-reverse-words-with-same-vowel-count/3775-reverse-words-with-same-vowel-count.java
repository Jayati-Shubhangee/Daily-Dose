class Solution {
    public String reverseWords(String s) {
         String[] words = s.split(" ");

        int firstVowelCount = countVowels(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (countVowels(words[i]) == firstVowelCount) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        return String.join(" ", words);
    }

    private int countVowels(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}