class Solution {
    public boolean lemonadeChange(int[] bills) {
       //my thought process
       //using frequency array 
       boolean ans= true;
       int[] count= new int[3];
       for(int i=0;i<bills.length;i++){
        if(bills[i]==5){
            count[0]++;
        }
        else if(bills[i]==10){
if(count[0]>0){
    count[0]--;
    count[1]++;
}
else{
    return false;
}
        }
else if(bills[i]==20){
if(count[0]>=1 && count[1] >=1 ){
    count[0]--;
    count[1]--;
}
else if(count[0]>=3){
    count[0]-=3;
}
else{
    return false;
}
}
        }
        return ans;
       }
       
    }
