class Solution {
    public int maxDepth(String s) {
        int count=0,maxcount=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                count++;
                if(maxcount<count)
                {
                    maxcount=count;
                }
            }
            else if(ch==')') count--;
        }
        return maxcount;
    }
}