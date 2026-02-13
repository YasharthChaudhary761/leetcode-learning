class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int left=1;
        int right=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            right=right*nums[i];
            max=Math.max(max,right);
            if(right==0) right=1;
        }
        for(int i=n-1;i>=0;i--)
        {
            left=left*nums[i];
            max=Math.max(max,left);
            if(left==0) left=1;
        }

        return max;
    }
}