class Solution {
    public int maxSubArray(int[] nums) {
      
      /**  int max=nums[0];
      for(int i=0;i<nums.length;++i){
        int sum=0;
       // if(nums.length==1) return sum;
        for(int j=i;j<nums.length;j++){
           
            
            sum=sum+nums[j];
            
            if(sum>max ){
                max=sum;
            }
         }
      }
        return max; */
         int ans=0,max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            ans=ans+nums[i];
            if(ans>max)
            {
                max=ans;
            }
            if(ans<0) ans=0;
            
        }
        return max; 
    }
}












