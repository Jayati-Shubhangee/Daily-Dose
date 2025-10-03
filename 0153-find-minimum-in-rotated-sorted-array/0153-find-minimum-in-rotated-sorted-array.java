class Solution {
    public int findMin(int[] nums) {
  int low= 0;
  int high=nums.length-1;
  int minval=0;
  /*while(low<high){ // wrong approach for dip fails at manu points 
int mid=(low+high)/2;
 minval=nums[mid];


    if(mid!=0 && mid!=nums.length-1 && nums[mid+1]<nums[mid]&&nums[mid-1]<nums[mid] ){

       //difference of both sides 
       int dif1=nums[mid]-nums[mid+1];//right side
       int dif2=nums[mid]-nums[mid-1];//left side
       if(dif1>dif2){
        low=mid+1;
       }
       else{
        high=mid-1;
       }


    }
    else if(mid!=0 && nums[mid-1]<nums[mid]){
        high=mid-1;
    }
    else if(mid!=nums.length-1 && nums[mid+1]<nums[mid]){
        low=mid+1;
    }


  } 
  return minval;*/
 /* while(low<high) {
    int mid= (low+high)/2;
    minval=nums[mid];
    if(nums[mid]>nums[high]){
low=mid+1;
    }
    else{
        high=mid;
    }
  }
  return minval;*/
    while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;   // min is in right half
            } else {
                high = mid;      // min is in left half including mid
            }
        }

        return nums[low];  // when loop ends, low==high -> min element
    }
}