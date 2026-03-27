class Solution {

    public int longestSubarray(int[] nums)
    {
        int zero=0;
        int max=0;
        int n=nums.length;
        int l=0, r=0;
        while(r<n)
        {
            if(nums[r]==0)
            {
                zero++;
            }

            while(zero>1)
            {
                if(nums[l]==0) zero--;
                l++;
            }
            max=Math.max(max, r-l);
            r++;
        }
        return max;
    }
}

 //     int curr=0, max=0;
    //     for(int j=0;j<nums.length;j++)
    //     {
    //         if(j==i) continue;
    //         if(nums[j]==1)
    //         {
    //             curr++;
    //             max=Math.max(curr,max);
    //         }
    //         else curr=0;
    //     }
    //     return max;
    // } 

    // public int longestSubarray(int[] nums) {
    //     int len=0;
    //     int maxLen=0;
    //     int n=nums.length;
    //     int countzero=0;
    //     for(int r=0;r<n;r++)
    //     {
    //         if(nums[r]==0)
    //         {
    //             countzero++;
    //             maxLen=Math.max(maxLen, findmax(nums,r));
    //         }
    //     }
    //     if(countzero==0) return n-1;
    //     return maxLen;