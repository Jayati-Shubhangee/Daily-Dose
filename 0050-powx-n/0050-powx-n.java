class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
     //Math.pow(x,n/2);
     if (n < 0) {
            x = 1 / x;
            // watch out for Integer.MIN_VALUE overflow
            if (n == Integer.MIN_VALUE) {
                return x * myPow(x, -(n + 1));
            }
            n = -n;
        }

    double halfpow = myPow(x,n/2);
      if(n%2!=0) {
        return x*halfpow*halfpow;
      }
      return halfpow*halfpow;
    }
}