class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int count = 0;
        for(int rotate=0;rotate<n;rotate++)
        {
              if(nums[rotate]>nums[(1+rotate)%n])
              {
                count ++;
              }
              if(count>1) return false;
        }
        return true;
    }
}