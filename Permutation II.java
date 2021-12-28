class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        permutation(nums,0,res);
        return( new ArrayList<>(res));
    }
    void permutation(int nums[], int index, Set<List<Integer>> res)
    {
        if(index==nums.length)
        {
            List<Integer> ds = new ArrayList<>();
            for(int i: nums)
                ds.add(i);
            
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(nums,i,index);
            permutation(nums,index+1,res);
            swap(nums,i,index);
        }
    }
    void swap(int nums[], int i, int j)
    {
        if(i==j)
            return;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}