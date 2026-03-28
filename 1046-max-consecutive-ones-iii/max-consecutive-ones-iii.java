class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int zero=0;
        int r=0, l=0;
        while(r<n)
        {
            if(nums[r]==0)
            {
                zero++;
            }

            while(zero>k)
            {
                if(nums[l]==0)
                {
                    zero--;
                }
                l++;
            }
            max=Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}