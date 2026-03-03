class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //brute force using array list and comparison technique 
        /*ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<asteroids.length;i++){
            ans.add(asteroids[i]);
        }
        //collision checking in arraylist 
        int i=0;
        while(i<ans.size()-1){
            if(ans.get(i)>0 && ans.get(i+1)<0){
                int a =ans.get(i);
                int b =ans.get(i+1);
                //cases check 
                if(Math.abs(a)==Math.abs(b)){
                    ans.remove(i+1);
                    ans.remove(i);
                    if(i!=0)i--;
                }
                else if(Math.abs(a)>Math.abs(b)){
                    ans.remove(i+1);
                }
                else if(Math.abs(a)<Math.abs(b)){
                    ans.remove(i);
                     if(i!=0)i--;
                }
            }
            else{
                i++;
            }
        }
        int [] res= new int[ans.size()];
        for( i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
return res;*/
//STACK LOGIC 
ArrayDeque<Integer> ast= new ArrayDeque<>();
for(int i=0;i<asteroids.length;i++){
     if(asteroids[i] > 0){
        ast.push(asteroids[i]);
    }
    else {

        // Remove smaller positives
        while(!ast.isEmpty() && ast.peek() > 0 
              && ast.peek() < Math.abs(asteroids[i])) {
            ast.pop();
        }

        // Equal case
        if(!ast.isEmpty() && ast.peek() > 0 
           && ast.peek() == Math.abs(asteroids[i])) {
            ast.pop();
        }
        // No positive left → push
        else if(ast.isEmpty() || ast.peek() < 0){
            ast.push(asteroids[i]);
        }
        // else: bigger positive remains → do nothing
    }
}
int[] res= new int[ast.size()];
for(int i=ast.size()-1;i>=0;i--){
res[i]=ast.pop();
}
return res;
    }
}