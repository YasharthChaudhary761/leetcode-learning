class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int sum=0;
        for(int i=1;i<n;i++)
        {
            int x=nums[i]-min;
            sum=sum+x;
        }
        return sum;
    }
}