class Solution {
    int MOD=1000000007;
    public long power(long x,long n)
    {
        if(n==0) return 1;
       
        long ans=power(x,n/2);
        if(n%2==0) {
            return(ans*ans)%MOD;
        }
        else {
            return (x*ans*ans)%MOD;
        }
    } 
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        return (int)((power(5,even)*power(4,odd))%MOD);
    }
}