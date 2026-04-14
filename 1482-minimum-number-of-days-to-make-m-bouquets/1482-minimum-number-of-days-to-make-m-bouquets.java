    class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
       // int[] ans = new int[n];
        int maxday = 0;
        int res = -1;


        for(int i = 0; i < n; i++){
            maxday = Math.max(maxday, bloomDay[i]);
        }
        if ((long)m * k > n) return -1;
        else{
       int low=1;
       int high=maxday;
       while(low<=high){
        int mid=(low+high)/2;
        int count=0;
        int vc=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            if(bloomDay[i]>mid || i==n-1){
                vc+=count/k;
                count=0;
            }
        }
        if(vc>=m){
            high=mid-1;
            res=mid;
        }
        else{
            low=mid+1;
        }
        
       }
        }
       return res;
    }
}