class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        int n=nums.length;
        int sum=0;
        int r=0, l=0;
        int zero=0;
        //int result=0;
        
        while(r<n)
        {
            sum=sum+nums[r];
            while(l<r && (nums[l]==0 || sum>goal))
            {
                if(nums[l]==0) zero++;
                else{
                    zero=0;
                }
                sum=sum-nums[l];
                l++;
            }
            if(sum==goal)
            {
                count=1+count+zero;
            }
            r++;
        }
        return count;
    }
}