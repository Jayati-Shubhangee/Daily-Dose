class Solution {
    public int[][] merge(int[][] intervals) {
        //first sorting the intervals array with start time
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        List<int[]> ans= new ArrayList<>();
        int start=intervals[0][0];
        int end= intervals[0][1];
        //traversal start 
        for(int i=1;i<intervals.length;i++){
            int nextstart=intervals[i][0];
            int nextend=intervals[i][1];
            //check for overlapping 
            if(nextstart<=end){
                end=Math.max(end,nextend);
            }
            else{
                ans.add(new int[]{start,end});
                start=nextstart;
                end=nextend;
            }
        }
        ans.add(new int[] {start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}