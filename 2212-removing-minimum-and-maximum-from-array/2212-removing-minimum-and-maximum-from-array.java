class Solution {
    public int minimumDeletions(int[] nums) {
       int result = 0;
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxpos = 0;
        int minpos = 0;
if(n==1){
    return 1;
    
}
      else{  // Step 1: Find max and min + their indices
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxpos = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minpos = i;
            }
        }

        // Step 2: Keep positions consistent (minpos < maxpos for convenience)
        if (minpos > maxpos) {
            int temp = minpos;
            minpos = maxpos;
            maxpos = temp;
        }

        // Step 3: Apply your if-else style to find minimal deletions

        // Deletions if removing from front
        int fromFront = Math.max(maxpos, minpos) + 1;

        // Deletions if removing from end
        int fromEnd = n - Math.min(maxpos, minpos);

        // Deletions if removing one from front and one from end
        int bothSides = (minpos + 1) + (n - maxpos);

        // Step 4: Apply your if logic pattern to choose minimal result
        if (fromFront <= fromEnd && fromFront <= bothSides) {
            result = fromFront;
        } else if (fromEnd <= fromFront && fromEnd <= bothSides) {
            result = fromEnd;
        } else {
            result = bothSides;
        }
      }
        return result;
    }
}