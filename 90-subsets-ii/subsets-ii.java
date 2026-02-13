class Solution {
    public void solve(int idx, int []nums, ArrayList<List<Integer>> ans, List<Integer> result)
    {
       //if(i>=nums.length) return;
       ans.add(new ArrayList<Integer>(result));
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1]) continue;
            result.add(nums[i]);
            solve(i+1, nums, ans, result);
            result.remove(result.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        solve(0, nums,ans, new ArrayList<Integer>());
        return ans;
    }
}