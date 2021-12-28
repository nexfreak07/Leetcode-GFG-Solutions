class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combos(k,n,res,ds,1);
        return res;
        
    }
    void combos(int k, int n, List<List<Integer>> res, List<Integer> ds,int index)
    {
        if(ds.size()==k && n==0)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        if(n>0){ 
        for(int i=index;i<=9; i++)
        {
            ds.add(i);
            combos(k,n-i,res,ds,i+1);
            ds.remove(ds.size()-1);
        }
        }
    }
}