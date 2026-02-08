class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
     /*  int n = nums.length;
       int ans =0;
       int countodd=0;
       int l=0;
       int r=0;
       while(r<n){
        if(nums[r]%2!=0){
            countodd++;
        }
        r++;
        if(countodd==k){
            ans++;
        }
        else if(countodd >k){
            countodd=0;
            l++;
            r=l;
        }
       }
return ans;*/
// SIMILAR TO PREFIX SUM ONLY WE NEED TO CONVERT IT INTO BINARY ARRAY THEN THE PROBLEM IS SAME AS BINARY SUM 
int n =nums.length;
for(int i=0;i<n;i++){
    if(nums[i]%2==0){
        nums[i]=0;
    }
    else{
        nums[i]=1;
    }
}
int[] ps= new int[n];
ps[0]=nums[0];
for(int i=1;i<n;i++){
    ps[i]=ps[i-1]+nums[i];
}

HashMap<Integer,Integer> map = new HashMap<>();
map.put(0,1);
int ans=0;
for(int i=0;i<n;i++){
    if(map.containsKey(ps[i]-k)){
ans+=map.get(ps[i]-k);
    }
    map.put(ps[i],map.getOrDefault(ps[i],0)+1);
}
return ans;
    }
}