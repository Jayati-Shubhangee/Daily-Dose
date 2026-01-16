class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //first we will for edge case
        if(intervals.length==0) return 0;
       
        //sorting based on last end value
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1],b[1]));
         int count=0;
        int prevend=intervals[0][1];//after sorting intialize not before
        for(int i=1;i<intervals.length;i++){
            int currstart=intervals[i][0];
            int currend= intervals[i][1];
            if(currstart < prevend){
                count++;
            }
            else{
prevend=currend;
            }
        }
        return count;
    }
}