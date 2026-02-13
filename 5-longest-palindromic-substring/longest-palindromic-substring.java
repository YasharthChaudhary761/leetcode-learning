class Solution {
    public String longestPalindrome(String s) {
        int start=0,end=0;
        int n=s.length();
        if(s==null || s.length()<1) return "";
        for(int i=0;i<n;i++)
        {
            int l1=expand(s,i,i);
            int l2=expand(s,i,i+1);
            int len=Math.max(l1,l2);
            if(len>end-start)
            {
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    private int expand(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}