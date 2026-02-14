class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        //BRUTE FORCE APPROACH TWO LOOPS + HASHMAP APPROACH 
      /*  int count=0;
        for(int i=0;i<nums.length;i++){
            //HASMAP CREATION 
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j =i;j<nums.length;j++){
map.put(nums[j],map.getOrDefault(nums[j],0)+1);
if(map.size()==k){
count++;
}
            }
        }
        return count;*/
        //SLIDING WINODW APPROACH 

        int l=0;
        int r=0;
        int count1=0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        while(r < nums.length){
            map1.put(nums[r],map1.getOrDefault(nums[r],0)+1);
             if(map1.size()>k){
                while(map1.size()>k){
                map1.put(nums[l],map1.getOrDefault(nums[l],0)-1);
                if(map1.get(nums[l])==0){
                    map1.remove(nums[l]);
                }
                l++;
                }
            }
             count1+=r-l+1;
            r++;
        }

        r=0;
        l=0;
        int count2=0;
         HashMap<Integer, Integer> map2 = new HashMap<>();
        while(r < nums.length){
            map2.put(nums[r],map2.getOrDefault(nums[r],0)+1);
             if(map2.size()>k-1){
                while(map2.size()>k-1){
                map2.put(nums[l],map2.getOrDefault(nums[l],0)-1);
                if(map2.get(nums[l])==0){
                    map2.remove(nums[l]);
                }
                l++;
                }
            }
             count2+=r-l+1;
            r++;
        }
return count1-count2;
    }
}