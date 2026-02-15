class Solution {
    public int findMin(int[] nums) {
        int x=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(x>nums[i])
            {
                x=nums[i];
            }
        }
        return x;
    }
}