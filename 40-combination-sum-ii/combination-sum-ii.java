class Solution {
    public void solve(int idx, int []candidate, int target, List<List<Integer>> ans, List<Integer> result)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(result));
            return;
        }
        for(int i=idx;i<candidate.length;i++)
        {
            if(i>idx && candidate[i]==candidate[i-1]) continue;
            if(candidate[i]>target) break;
            result.add(candidate[i]);
            solve(i+1, candidate, target-candidate[i], ans, result);
            result.remove(result.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,candidates, target, ans, new ArrayList<>());
        return ans;
    }
}