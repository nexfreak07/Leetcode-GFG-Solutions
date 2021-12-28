class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
         ArrayList<Integer> res = new ArrayList<>();
        sum(arr,res,0,0);
        Collections.sort(res);
        return res;
    }
    void sum(ArrayList<Integer> arr, ArrayList<Integer> res, int index, int sum)
    {
        if(index== arr.size())
        {
            res.add(sum); // Add the sum of elements of subset
            return;
        }
        // Pick the element
        sum(arr,res,index+1,sum+arr.get(index));
        // Do not pick the element
        sum(arr,res,index+1,sum);
    }
}