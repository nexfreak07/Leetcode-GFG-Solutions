class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s==null || s.length()==0)
            return 0;
        char sign = '+';
        int i = 0;
        //check for the sign
        if(s.charAt(i)=='-'){ 
            sign = '-';
            i++;
        }
        else if(s.charAt(i)=='+')
            i++;
        
        double res = 0.0;
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9')
        {
            res = res * 10 + (s.charAt(i) - '0');
            i++;
        }
        if(sign =='-')
            res = -res;
        
        if(res > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(res < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else
            return (int) res;
        
    
        
    }
}