class Solution {
    public List<String> find_permutation(String S) {
        List<String> res = new ArrayList<>();
        String ip = S;
        String op = "";
        solve(ip,op,res);
        Collections.sort(res);
        return res;
    }
    void solve(String ip, String op, List<String> res)
    {
        if(ip.length()==0)
        {
            res.add(op);
            return;
        }
        for(int i = 0; i<ip.length(); i++)
        {
            String newC = op + ip.charAt(i);
            String newR = ip.substring(0,i) + ip.substring(i+1);
            solve(newR, newC, res);
        }
        
    }
}