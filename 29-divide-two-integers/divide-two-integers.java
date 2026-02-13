class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        if(dividend== Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(divisor==1) return dividend;
        if(dividend ==-1) return -dividend;
        boolean sign =true;
        if(dividend>0 && divisor<0) sign = false;
        if(dividend<0 && divisor>0) sign = false;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        divisor=Math.abs(divisor);
        long quotient=0;

        int ans=0;
        while(n>=d){
            int count=0;
            while(n>=(d<<(count+1))){
                count++;
            }
            quotient+=1<<count;
            n=n-(d<<count);
        }
        if(quotient==(1<<31) && sign) return Integer.MAX_VALUE;
        if(quotient==(1<<31) && !sign) return Integer.MIN_VALUE;
        return (sign) ? (int)quotient: (int)-quotient;
    }
}