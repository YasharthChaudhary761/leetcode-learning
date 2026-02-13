class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
        if(nums[i]!=i)
        {
            return i;
        }
       }

       if(nums[n-1]!=n)  return n;
       return -1;
    }
}