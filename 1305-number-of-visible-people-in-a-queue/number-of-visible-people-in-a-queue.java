class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] ans=new int[n];
        Stack<Integer> stk=new Stack<>();
        stk.push(heights[n-1]);
        ans[n-1]=0;
        
        for(int i=n-2;i>=0;i--)
        {
            int count=0;
            while(stk.size()>0 && stk.peek()<heights[i])
            {
                count++;
                stk.pop();
            }
            if(stk.size()>0) count++;
            ans[i]=count;
            stk.push(heights[i]);
        }
        return ans;
    }
}