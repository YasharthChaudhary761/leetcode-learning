class Solution {
    public void solve(int idx, int k, int n, ArrayList<List<Integer>> ans, ArrayList<Integer> result)
    {
        if(result.size()>k) return;
        if(n==0 && result.size()==k)
        {
            ans.add(new ArrayList<>(result));
        }
        for(int i=idx; i<=9 ;i++)
        {
            result.add(i);
            solve(i+1, k, n-i, ans, result);
            result.remove(result.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> ans =new ArrayList<>();
        solve(1, k, n, ans, new ArrayList<>());
        return ans;
    }
}