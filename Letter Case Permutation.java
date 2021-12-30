class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        String op = "";
        String ip = s;
        permute(ip,op,res);
        return res;
        
    }
    void permute(String ip, String op, List<String> res)
    {
        if(ip.length()==0)
        {
            res.add(op);
            return;
        }
        if(Character.isAlphabetic(ip.charAt(0)))
        {
            String op1 = op;
            String op2 = op;
            op1 = op1 + Character.toLowerCase(ip.charAt(0));
            op2 = op2 + Character.toUpperCase(ip.charAt(0));
            ip = ip.substring(1);
            permute(ip,op1,res);
            permute(ip,op2,res);
        }
        else
        {
            String op1 = op;
            op1 = op1 + ip.charAt(0);
            ip = ip.substring(1);
            permute(ip,op1,res);
        }
    }
}