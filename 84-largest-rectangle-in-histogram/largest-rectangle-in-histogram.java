class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stk=new Stack<>();
       // int width=0;

        // right se small calculate krne ke liye
        for(int i=n-1;i>=0;i--)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >=heights[i])
            {
                stk.pop();
            }
            right[i]=stk.isEmpty() ? n:stk.peek();
            stk.push(i);
        }

        // bache hue elements ko pop krne ke liye....isko overcome krne ke liye dusra bhi stack le skte the
        while(!stk.isEmpty())
        {
            stk.pop();
        }
 

       // left se small calculate krne ke liye
        for(int i=0;i<n;i++)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >=heights[i])
            {
                stk.pop();
            }
            left[i]=stk.isEmpty() ? -1:stk.peek();
            stk.push(i);
        }


        int maxArea=0;
        for(int i=0;i<n;i++)
        {
            int width=right[i] - left[i] - 1;
            int area=heights[i]*width;
            maxArea=Math.max(maxArea, area);
        }
        return maxArea;
    }
}