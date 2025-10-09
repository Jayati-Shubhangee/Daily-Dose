class Solution {
    public String longestPalindrome(String s) {
      /* if (s == null || s.length() == 0) return "";

        String longest = ""; // store longest palindrome found

        int n = s.length();
        for (int i = 0; i < n; i++) {         // start index
            for (int j = i + 1; j <= n; j++) { // end index (exclusive)
                String sub = s.substring(i, j);   // generate substring

                // check if substring is palindrome
                String reversed = new StringBuilder(sub).reverse().toString();
                if (sub.equals(reversed)) {
                    // update longest if this palindrome is longer
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        return longest;  */
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}