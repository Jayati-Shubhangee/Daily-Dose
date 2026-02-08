class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        /*int l=0;
        int r=0;
        int n = nums.length;
        int sum=0;
        int ans=0;
        while(r<n){
            sum+=nums[r];
            if(sum==goal){
                ans++;
            }
            r++;
            if(sum>goal){
                while(sum > goal){
                    sum=sum-nums[l];
                    l++;

                }
                if(sum==goal){
                    ans++;
                }
               
            }
        }
        return ans;*/
        // SAME PREFIX SUM + HASMAP LOGIC REPEATED 
        int n = nums.length;
        int[] ps= new int[n];
        ps[0]=nums[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
        }
        int ans=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
if(map.containsKey(ps[i]-goal)){
ans+=map.get(ps[i]-goal);
}
map.put(ps[i],map.getOrDefault(ps[i],0)+1);
        }
        return ans;
    }
}