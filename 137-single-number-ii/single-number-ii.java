class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int k=0;k<=31;k++)
        {
            int temp=(1<<k);
            int count1=0;
            for(int num:nums)
            {
                if((num & temp)==0){

                }
                else{
                    count1++;
                }
            }
            if(count1%3==1){
                result=(result | temp);
            }
        }
        return result;
    }
}