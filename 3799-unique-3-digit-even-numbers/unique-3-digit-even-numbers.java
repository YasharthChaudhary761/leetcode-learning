class Solution {
    
    public int totalNumbers(int[] digits) {
       HashSet<Integer> map=new HashSet<>();
       int n=digits.length;

       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                if(i==k || i==j || j==k)
                {
                    continue;
                }
                int num=digits[i]*100+digits[j]*10+digits[k];
                if(num>=100 && num<1000 && num%2==0) map.add(num);
            }
        }
       }
       return map.size();
    }
}