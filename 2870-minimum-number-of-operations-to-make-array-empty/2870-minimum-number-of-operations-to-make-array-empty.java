class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>mp:map.entrySet()){
            if(mp.getValue()==1){
                ans= -1;
                break;
            }
            else{            
             if(mp.getValue()%3==0){
                ans+=mp.getValue()/3;
            }
           else if (mp.getValue() % 3 == 1) {
                ans += (mp.getValue() / 3 - 1) + 2;
            } else { // f % 3 == 2
                ans += mp.getValue() / 3 + 1;
            }
            }
        }
        return ans;
    }
}