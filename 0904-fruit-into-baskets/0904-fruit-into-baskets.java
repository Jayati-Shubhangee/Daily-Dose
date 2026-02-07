class Solution {
    /* ArrayList<Integer> basket1= new ArrayList<>();
     ArrayList<Integer> basket2= new ArrayList<>();*/
    public int totalFruit(int[] fruits) {
        /*int i=0;
        int j=i+1;
        int maxpick=0;
         basket1.add(fruits[i]);
             int pick=1;
        while(j<fruits.length){
            //making 2 baskets
            
             if(basket1.contains(fruits[j])){
                pick++;
                
             }
             else if(basket2.contains(fruits[j])){
                pick++;
                
             }
             else if(!basket1.contains(fruits[j])){
                basket2.add(fruits[j]);
                pick++;
                
             }
             j++;
             maxpick=Math.max(pick,maxpick);
             if((j != fruits.length )&& (!basket1.contains(fruits[j]) && !basket2.contains(fruits[j]))){
             ArrayList<Integer> basket1= new ArrayList<>();
             ArrayList<Integer> basket2= new ArrayList<>();
                i++;
                basket1.add(fruits[i]);
                pick=1;
            
             }

        }
        return maxpick;*/

        //SET APPROACH 
        
        /*int maxpick=0;
        for(int i=0;i<fruits.length;i++){
             HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<fruits.length;j++){
                set.add(fruits[j]);
                if(set.size()<=2){
                    maxpick=Math.max(maxpick,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return maxpick;*/

        int l=0;
        int r=0;
          HashMap<Integer, Integer> map= new HashMap<>();
          int maxlen=0;
        while(r<fruits.length){
          
            //putting the elemnts in map
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(fruits[l],map.get(fruits[l])-1);
                    if(map.get(fruits[l])==0){
                        map.remove(fruits[l]);
                    }
                    l++;
                }
              
            }
              maxlen=Math.max(maxlen,r-l+1);
              r++;
        }
        return maxlen;
        }
    }
