class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        int lp = 1;
        int rp = 1;
       for(int i=0; i<n; i++)
       {
         ans[i] = 1;
       }

       for(int i=0; i<n; i++)
       {
        ans[i] = ans[i] * lp;
        lp = lp * nums[i];
       }

       for(int j=n-1; j>=0; j--)
       {
        ans[j] = ans[j] * rp;
        rp = rp * nums[j];
       }
       return ans;
    }
}