class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n==0)
            return true;
        if(m==0)
            return false;
        
        return check(s,t,0,0);
        
        
    }
    boolean check(String s, String t, int i, int j)
    {
        if(i==s.length())
            return true;
        if(j==t.length())
            return false;
        
        if(s.charAt(i)==t.charAt(j))
            return check(s,t,i+1,j+1);
        else
            return check(s,t,i,j+1);
    }
    
}