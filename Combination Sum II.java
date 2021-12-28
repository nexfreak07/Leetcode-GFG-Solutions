class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        combos(candidates,target,0,res,ds);
        return res;
    }
    void combos(int candidates[], int target, int index, List<List<Integer>> res, List<Integer> ds)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        if(target>0)
        {
            for(int i=index; i<candidates.length;i++)
            {
                if(i!=index && candidates[i]==candidates[i-1])
                    continue;
                if(candidates[i]>target)
                    break;
                
                ds.add(candidates[i]);
                combos(candidates,target-candidates[i],i+1,res,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
}