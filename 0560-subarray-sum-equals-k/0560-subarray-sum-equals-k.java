class Solution {
    public int subarraySum(int[] nums, int k) {
       /*  int l=0;
        int r=0;
        int n = nums.length;
        int sum=0;
        int ans=0;
        while(r<n){
            sum+=nums[r];
            if(sum==k){
                ans++;
            }
            r++;
            if(sum>k){
                while(sum > k){
                    sum=sum-nums[l];
                    l++;
                }
                 if(sum==k){
                    ans++;
                 }
            }
           
        }
        return ans;*/

//USING PREFIX SUM AND HASING APPROACH 
int n = nums.length;
int[] ps= new int[n];
ps[0]=nums[0];
for(int i=1;i<n;i++){
    ps[i]=ps[i-1]+nums[i];
}
HashMap<Integer, Integer> map = new HashMap<>();
/*//map.put(0, 1); 
int ans=0;
for(int i=0;i<n;i++){
    if(ps[i]==k){
ans+=1;
 map.put(ps[i],map.getOrDefault(ps[i],0)+1);
    }
    else if(map.containsKey(ps[i]-k)){
        ans+=map.get(ps[i]-k);
         map.put(ps[i],map.getOrDefault(ps[i],0)+1);
    }
    else if(!map.containsKey(ps[i]-k)){
        map.put(ps[i],map.getOrDefault(ps[i],0)+1);
    }
}
return ans;*/
map.put(0, 1); 

int ans = 0;

for (int i = 0; i < n; i++) {

    if (map.containsKey(ps[i] - k)) {
        ans += map.get(ps[i] - k);
    }

    map.put(ps[i], map.getOrDefault(ps[i], 0) + 1); 
}
return ans;
    }
}