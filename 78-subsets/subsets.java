class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList();
        if(nums==null || nums.length==0) return ans;
        solve(nums, 0, new ArrayList<Integer>());
        return ans;
    }
    public void solve(int[] nums, int i, ArrayList<Integer> temp)
    {
        if(i>=nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(nums, i+1, temp);

        temp.remove(temp.size()-1); // we took temp.size because we remove the elements from the stack as recursive calls works on the principle if stack
        solve(nums, i+1, temp);
    }
}