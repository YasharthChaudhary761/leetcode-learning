class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        //temp me store kro
        int temp[]=new int[k];
        for(int j=0;j<k;j++)
        {
           temp[j]=nums[n-k+j];
        }

        //shifting
         for(int i=n-k-1;i>=0;i--)
        {
            nums[i+k]=nums[i];
        }


        //storing temp value to nums
        for(int i=0;i<k;i++)
        {
            nums[i]=temp[i];
        }
        System.out.println(nums);
    }
}