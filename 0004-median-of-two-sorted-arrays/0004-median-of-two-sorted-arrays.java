class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    ArrayList<Integer> combined= new ArrayList<>();
    double ans=0;
     for(int i=0;i<nums1.length;i++){
        combined.add(nums1[i]);
     }
     for(int i=0;i<nums2.length;i++){
        combined.add(nums2[i]);
     }
     Collections.sort(combined);
     if(combined.size()%2==0){
         ans=((combined.get(combined.size()/2)+combined.get((combined.size()/2)-1))/2.0);
     }
     else{
       ans=combined.get(combined.size()/2);
     }
     return ans;
    }
}