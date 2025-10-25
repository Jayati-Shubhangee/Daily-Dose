class Solution {
    public int smallestAbsent(int[] nums) {
       // convert int[] -> ArrayList<Integer>
        ArrayList<Integer> newarr = new ArrayList<>();
        for (int n : nums) newarr.add(n);

        // if empty, by your earlier behaviour we can return 1 (smallest positive missing)
        if (newarr.isEmpty()) return 1;

        // compute sum and avg
        int sum = 0;
        for (int i = 0; i < newarr.size(); i++) sum += newarr.get(i);
        int avg = sum / newarr.size();

        // get max
        int max = Collections.max(newarr);

        // NEW: if every element is <= 0 (max < 1), return 1
        // This ensures arrays with only negative numbers (or zeros) return 1.
        if (max < 1) return 1;

        int res = 0;
        int found = 0;
        for (int i = 1; i < max; i++) {
            if (i > avg && !newarr.contains(i)) {
                found = 1;
                res = i;
                return res;
            }
        }

        if (found == 0) res = max + 1;
        return res;
    }
}