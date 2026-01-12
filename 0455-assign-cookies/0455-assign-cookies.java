class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //my approach of solving 
        int ans=0;
        int i=0;
        int j =0;
        //converting array to arraylist 
        Arrays.sort(s);
        Arrays.sort(g);
      /*  ArrayList<Integer> c= new ArrayList<>();
        for (int x : s) {
         c.add(x);
}
        while(i!=g.length){
int min=Integer.MAX_VALUE;
int pos=0;
int found=0;
for(int j=0;j<c.size();j++){
    if(c.get(j)-g[i] < min && c.get(j)-g[i] >=0){
        min=c.get(j)-g[i];
        pos=j;
        found=1;

    }
}
if(found==1){
    c.remove(pos);
    ans++;
    i++;
}
else{
    i++;
}

        }*/
while(j < s.length && i< g.length){
    if(s[j]>=g[i]){
        ans++;
        i++;
        j++;
    }
    else{
        j++;
    }
}
        return ans;
    }
}