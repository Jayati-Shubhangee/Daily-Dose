import java.util.Scanner;

public class maxarray {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr= new int[n];
      //entering the array ele
      for(int i=0;i<arr.length;i++){
        arr[i]= scn.nextInt();
      }
int max= maxofarray(arr,0);
System.out.println(max);
    }

    public static int maxofarray(int[] input,int idx){
        if(idx==input.length-1){
            return input[idx];
        }
int maxinsmall=maxofarray(input,idx+1);
if(maxinsmall>input[idx]){
    return maxinsmall;
}
else{
    return input[idx];
}
    }
}
