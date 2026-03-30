class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length-1];
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);

        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);
        for(int i=2; i<nums.length-1;i++)
        {
            int take=nums[i]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(take, skip);
        }
          

        int[] dp2=new int[nums.length];
        dp2[1]=nums[1];
        dp2[2]=Math.max(nums[1], nums[2]);
        for(int j=3;j<nums.length;j++)
        {
            int take=nums[j]+dp2[j-2];
            int skip=dp2[j-1];
            dp2[j]=Math.max(take, skip);
        }
        return Math.max(dp[nums.length-2], dp2[nums.length-1]);
    }
}