class Solution {
    public int beautySum(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            int []arr=new int [26];
            for(int j=i;j<s.length();j++)
            {
                arr[s.charAt(j)-'a']++;
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int k=0;k<arr.length;k++)
                {
                    max=Math.max(max,arr[k]);
                    if(arr[k]!=0) min=Math.min(min,arr[k]);
                }
                count=count+(max-min);
            }
        }
        return count;
    }
}