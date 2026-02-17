class StockSpanner {
    ArrayDeque<Pair> s = new ArrayDeque<>();
    int i=0;
static class Pair{
    int value;
    int index;
    Pair(int value, int index){
        this.value=value;
        this.index=index;
    }
}
    public StockSpanner() {
        s = new ArrayDeque<>();
        int i=0;

    }
    
    public int next(int price) {
        int span=0;
       while(!s.isEmpty() && s.peek().value<=price) {
        s.pop();
       }
       if(s.isEmpty()){
         span= i+1;

       }
       else{
         span= i-s.peek().index;
       }
       s.push(new Pair( price, i ));
       i++;
       return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */