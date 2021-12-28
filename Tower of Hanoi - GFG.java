class Hanoi {
    long moves = 0L;
    public long toh(int N, int S, int D, int H) {
        // Your code here
        
        if(N==1)
        {
             System.out.println("move disk " + N + " from rod " + S + " to rod " + D);
             moves++;
             return moves;
        }
        toh(N-1,S,H,D);
        System.out.println("move disk " + N + " from rod " + S + " to rod " + D);
        moves++;
        
        return toh(N-1,H,D,S);
        
        
        
    }
}