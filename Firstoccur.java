import java.util.Scanner;

public class Firstoccur {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr= new int[n];
      //entering the array ele
      for(int i=0;i<arr.length;i++){
        arr[i]= scn.nextInt();
      }
      int ele= scn.nextInt();
int res= firstidx(arr,0,ele);
System.out.println(res);
    }
    public static int firstidx(int[] arr, int idx,int searchele){
if(idx==arr.length-1){
    return idx;
}

        int fidx=firstidx(arr,idx+1,searchele);
if(arr[idx]==searchele){
    return idx;
}
return fidx;
    }
    
}
