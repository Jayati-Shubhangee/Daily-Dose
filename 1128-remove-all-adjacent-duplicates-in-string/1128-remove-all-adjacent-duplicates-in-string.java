class Solution {
    public String removeDuplicates(String s) {
       StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = i + 1;

        while (j < sb.length()) {

            if (sb.charAt(i) != sb.charAt(j)) {
                // move forward normally
                i++;
                j++;
            } else {
                // duplicate found → delete the pair
                sb.delete(i, i + 2);

                // after deletion, string shrinks
                i--;

                // boundary check
                if (i < 0) i = 0;

                // reset j to be right after i
                j = i + 1;
            }
        }

        return sb.toString();
    }
}
