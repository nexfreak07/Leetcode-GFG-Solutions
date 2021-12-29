class Solution{
    
    ArrayList<String> permutation(String S){
        // Code Here
        String op = "" + S.charAt(0);
        String ip = S.substring(1);
        ArrayList<String> res = new ArrayList<>();
        solve(ip,op,res);
        Collections.sort(res);
        return res;
    }
    void solve(String ip, String op, ArrayList<String> res)
    {
        if(ip.length()==0)
        {
            res.add(op);
            return;
        }
        
        String op1 = op;
        String op2 = op;
        
        op1 = op1 + " " + ip.charAt(0);
        op2 = op2 + ip.charAt(0);
        
        ip = ip.substring(1);
        
        solve(ip,op1,res);
        solve(ip,op2,res);
    }
    
}