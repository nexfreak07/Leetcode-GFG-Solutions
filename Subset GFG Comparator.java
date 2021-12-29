class Solution
{
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        subs(A,res,ds,0);
        int i=0;
        Collections.sort(res, new Comparator<ArrayList<Integer>>()
        {
            public int compare(ArrayList<Integer> p, ArrayList<Integer> q)
            {
                int i = 0;
                while(i < Math.min(p.size(), q.size()))
                {
                if(p.get(i) == q.get(i))
                {
                    i++;
                    continue;
                }
                if(p.get(i) < q.get(i))
                    return -1;
                return 1;
            }
            if(i<q.size())
                return -1;
            if(i<p.size())
                return 1;
            return 0;
        }
        });
        return res;
    }
    static void subs(ArrayList<Integer> nums,ArrayList<ArrayList<Integer>> res, ArrayList<Integer>ds, int index)
    {
        res.add(new ArrayList<>(ds));
        
        for(int i=index; i<nums.size();i++)
        {
            ds.add(nums.get(i));
            subs(nums,res,ds,i+1);
            ds.remove(ds.size()-1);
        }
    }
}