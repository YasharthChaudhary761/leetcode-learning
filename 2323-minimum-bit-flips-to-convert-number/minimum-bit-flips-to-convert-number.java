class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        int xoroperation=start^goal;
        while(xoroperation !=0)
        {
            xoroperation=xoroperation & (xoroperation-1);
            count++;
        }
        return count;
    }
}