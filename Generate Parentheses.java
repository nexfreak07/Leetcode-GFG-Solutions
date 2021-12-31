class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String op = "(";
        int o = n-1;
        int c = n;
        solve(o,c,res,op);
        return res;
        
    }
    void solve(int o, int c, List<String> res, String op)
    {
        if(o==0 && c==0)
        {
            res.add(op);
            return;
        }
        if(o!=0)
        {
            String op1 = op;
            op1 = op1 + "(";
            solve(o-1,c,res,op1);
            
        }
        if(c>o)
        {
            String op2 = op;
            op2 = op2 + ")";
            solve(o,c-1,res,op2);
        }
    }
}