class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combos(candidates,target,0,res,ds);
        return res;
    }
    void combos(int nums[], int t, int index, List<List<Integer>> res, List<Integer> ds)
    {
        if(index==nums.length)
        {
            if(t==0)
            {
                res.add(new ArrayList<>(ds));
                
            }
            return;
        }
        if(t>=nums[index])
        {
            ds.add(nums[index]);
            combos(nums,t-nums[index],index,res,ds);
            ds.remove(ds.size()-1);
        }
        combos(nums,t,index+1,res,ds);
    }
}