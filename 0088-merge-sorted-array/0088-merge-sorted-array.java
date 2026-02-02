class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

       /* else if(m==0 && n!=0){//should copy num 2 to num 1
        nums1=nums2;
            System.out.println(nums1);
        }*/
            int i =m-1;
            int j =n-1;
            int k = m+n-1;
            if(m==0 && n!=0){
                nums1[k]=nums2[j];
                j--;
                k--;
            }
            else{
            while(i>=0 && j>=0){
                if(nums1[i]>nums2[j]){
                    nums1[k]=nums1[i];
                       i--;
                }
                else{
                     nums1[k]=nums2[j];
                       j--;
                }
             
                k--;
            }
            }
            while(j>=0){
                nums1[k]=nums2[j];
                j--;
                k--;
            }
             //Arrays.sort(nums1);
       // System.out.println(nums1);
        
       
    }
}