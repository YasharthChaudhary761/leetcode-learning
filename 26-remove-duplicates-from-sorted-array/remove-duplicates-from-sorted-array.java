class Solution {
    public int removeDuplicates(int[] nums) {
     //   int n=nums.length;
        int left=0;
        for(int right=1;right<nums.length;right++)
        {
            if(nums[right]!=nums[left])
            {
                nums[left+1]=nums[right];
                left++;
            }
        }
        return left+1;
    }
}