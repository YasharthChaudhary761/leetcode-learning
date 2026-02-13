class Solution {
        public int myAtoi(String s) {
        s=s.trim();
        long ans=0;
        int sign=1;
        if(s.isEmpty()) return 0;
        int i=0;
        if(s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+')
        {
            sign=1;
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
           ans=ans*10+(s.charAt(i)-'0');
           i++;
           if(ans*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
           if(ans*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) (sign*ans);
    }

 /**    public int getans(int i,int sign, String s)
    {
        
    }
    public int myAtoi(String s)
    {
        s=s.trim();
        int sign;
        if(s.isEmpty()) return 0;
        int i=0;
        
    } */
}