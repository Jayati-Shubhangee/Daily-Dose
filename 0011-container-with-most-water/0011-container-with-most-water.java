class Solution {
    public int maxArea(int[] height) {
        /*int maxh=height[0];
        int maxidx=0;
        
        for( int i=1;i<height.length;i++){
            if(height[i]>maxh){
                maxh=height[i];
                maxidx=i;
            }
        }
        int smax=0;
        int smaxidx=0;
        for(int j=maxidx;j<height.length;j++){
            if(height[j]<maxh && height[j]>smax){
                smax=height[j];
                smaxidx=j;

            }
        }
        return((smaxidx-maxidx) *(smax)) ;*/
       /* int n = height.length;
        int maxarea=0;
int found=0;
        for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
    
    int dis=j-i;
    //if(height[j]<=height[i] ){
        
        int min=Math.min(height[i],height[j]);
        found=1;
        maxarea=Math.max(maxarea,(j-i)*min);
    
}

        }
        if(found==0){
         maxarea=height[0];
        }
return maxarea;*/
int left =0;
int right=height.length-1;
int maxarea=0;
while(left < right){
maxarea=Math.max(maxarea,(right-left)*Math.min(height[left],height[right]));
    if(height[left]<height[right]){
left++;
    }
    else if(height[right]<height[left]){
        right--;
    }
    else{
        left++;
        right--;
    }
}
return maxarea;
    }
}