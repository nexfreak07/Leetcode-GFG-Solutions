class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = search(nums,target,0,nums.length);
        return ans;
    }
    int search(int nums[], int t, int s, int e)
    {
          
        int m = s + (e-s)/2;
        if(t>nums[nums.length-1])
            return e;
        if(s>e)
            return m;
        
       
        if(t==nums[m])
            return m;
        if(t<nums[m])
            return search(nums,t,s,m-1);
        else
            return search(nums,t,m+1,e);
      
    }
}