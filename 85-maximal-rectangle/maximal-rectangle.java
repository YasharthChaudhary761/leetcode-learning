class Solution {
    public int[] getNSR(int[] height)
    {
        Stack<Integer> stk=new Stack<>();
        int n=height.length;
        int[] nsr=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!stk.isEmpty() && height[stk.peek()]>=height[i]) stk.pop();
            nsr[i]=stk.isEmpty() ? n:stk.peek();
            stk.push(i);
        }
        return nsr;
    }
    public int[] getNSL(int[] height)
    {
        Stack<Integer> stk=new Stack<>();
        int n=height.length;
        int[] nsl=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!stk.isEmpty() && height[stk.peek()]>=height[i]) stk.pop();
            nsl[i]=stk.isEmpty() ? -1:stk.peek();
            stk.push(i);
        }
        return nsl;
    }

    public int findmaxArea(int[] height)
    {
        // width=NSR[i]-NSL[i]-1

        int[] NSR=getNSR(height);
        int[] NSL=getNSL(height);
        int n=height.length;
        int[] width=new int[n];
        for(int i=0;i<n;i++)
        {
            width[i]=NSR[i]-NSL[i]-1;
        }
        int maxArea=0;
        for(int i=0;i<n;i++)
        {
            int area=width[i]*height[i];
            maxArea=Math.max(maxArea, area);
        }
        return maxArea;
    }


    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] height=new int[n];

        for(int i=0;i<n;i++)
        {
            height[i]=(matrix[0][i]=='1')?1:0;
        }
        int maxArea=findmaxArea(height);

        for(int r=1;r<m;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(matrix[r][c]=='0')
                {
                    height[c]=0;
                }
                else
                {
                    height[c]=height[c]+1;
                }
            }
            maxArea=Math.max(maxArea, findmaxArea(height));
        }
        return maxArea;
    }
}