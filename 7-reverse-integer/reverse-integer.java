class Solution {
    public int reverse(int x) {
        return ans(x,0);
    }
    public static int ans(int x,int rev)
    {
        if(x==0) return rev;
        if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10) return 0;
        int remainder=x%10;
        x=x/10;
        rev=rev*10+remainder;
        return ans(x,rev);
    }
}