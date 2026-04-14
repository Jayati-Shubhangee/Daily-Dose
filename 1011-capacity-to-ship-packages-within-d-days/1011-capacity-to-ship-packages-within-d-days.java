class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //first approach
        int start=0;
        int res=0;
        for(int i=0;i<weights.length;i++){
start=Math.max(weights[i],start);
        }
        int wsum=0;
        for(int i=0;i<weights.length;i++){
wsum+=weights[i];
        }

       int low=start;
       int high=wsum;
       while(low<=high){
        int mid=(low+high)/2;
             int sum = 0;
            int count = 1; 

 for(int j = 0; j < weights.length; j++){
    if(sum + weights[j] <= mid){
        sum += weights[j];
    } else {
        count++;
        sum = weights[j];
    }
}   
            
            if(count >days){
                low=mid+1;
               
            
            }
            else{
                high=mid-1;
                 res=mid;
            }
        }
            return res;
        }
        
    }
