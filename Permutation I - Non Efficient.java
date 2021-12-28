class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length+1];
        permutation(nums,freq,res,ds);
        return res;
    }
    void permutation(int nums[], boolean freq[], List<List<Integer>> res, List<Integer> ds)
    {
        if(ds.size() == nums.length)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                ds.add(nums[i]);
                freq[i] = true;
                permutation(nums,freq,res,ds);
                freq[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
}