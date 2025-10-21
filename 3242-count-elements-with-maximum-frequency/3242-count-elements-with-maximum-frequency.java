class Solution {
    public int maxFrequencyElements(int[] nums) {
     //traversinf the nums array for frequency and storing the frequency in a freq array
     HashSet<Integer> elecheck= new HashSet<>();

     int[] freq= new int[nums.length];
     for(int i=0;i<nums.length;i++){
        int count=1;
        if(elecheck.contains(nums[i])==false){
for(int j=i+1;j<nums.length;j++){
if(nums[j]==nums[i]){
    count++;
}
    }
freq[i]=count;
        }
else{
continue;
}
     }
int max=Integer.MIN_VALUE;
for(int i=0;i<freq.length;i++){
    if(freq[i]>max){
        max=freq[i];
    }
}
//checking how many ele with max freq
int res=0;
for(int i=0;i<freq.length;i++){
    if(freq[i]==max){
res+=freq[i];
    }
}
return res;
    }
}