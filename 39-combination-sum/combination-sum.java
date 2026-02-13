class Solution {
    public void solve(int i, int[] candidate, int target, List<Integer> curr,List<List<Integer>> ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i>=candidate.length || target<0) return;
        curr.add(candidate[i]);
        solve(i, candidate, target-candidate[i], curr, ans);
        curr.remove(curr.size()-1);
        solve(i+1, candidate, target, curr, ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}