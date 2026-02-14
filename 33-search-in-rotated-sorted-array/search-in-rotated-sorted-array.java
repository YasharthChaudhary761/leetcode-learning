class Solution {
    public int search(int[] nums, int target) {
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==target) return i;
      }
      return -1;
    }
}


 /**int count=0;
        int n=nums.length;
        if(n==1 & nums[0]!=target) return -1; 
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                break;
            }
            count++;
        }
        return count; */