class Solution {
    public int candy(int[] ratings) {
    int n= ratings.length;
    int[] left=new int[n];
    int[] right=new int[n];
    int[] maxarr=new int[n];
    //adding in left array 
    left[0]=1;
    for(int i=1;i<n;i++){
        if(ratings[i]>ratings[i-1]){
            left[i]=left[i-1]+1;
        }
        else{
            left[i]=1;
        }
    }
    //adding in right
    right[n-1]=1;
    for(int i=n-2;i>=0;i--){
        if(ratings[i]>ratings[i+1]){
            right[i]=right[i+1]+1;
        }
        else{
            right[i]=1;
        }
    }
for(int k=0;k<n;k++){
    maxarr[k]=Math.max(left[k],right[k]);
}
int sum=0;
for(int ele:maxarr){
sum+=ele;
}
return sum;
    }
}