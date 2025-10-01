class Solution {
    public int climbStairs(int n) {

   /* if(n == 1) 
    { 
 return 1; 
    } 
   if(n == 2) 
    {       return 2; 

    }    int ans = climbStairs(n-1) + climbStairs(n-2); 
    return ans; 
*/
if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 1; // ways(1)
        int b = 2; // ways(2)

        for (int i = 3; i <= n; i++) {
            int c = a + b; // current = sum of last 2
            a = b;        // shift forward
            b = c;
        }

        return b; // answer for n
}     
    }
