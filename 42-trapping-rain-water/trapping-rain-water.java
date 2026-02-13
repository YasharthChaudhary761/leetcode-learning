class Solution {

    public int[] getleftmaximum(int[] height, int n)
    {
        int[] leftmax=new int[n];
        leftmax[0]=height[0];

        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
        }
        return leftmax;
    }


    public int[] getrightmaximum(int[] height, int n)
    {
        int[] rightmax=new int[n];
        rightmax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1], height[i]);
        }
        return rightmax;
    }


    public int trap(int[] height) {
        int n=height.length;
        int[] leftMax=getleftmaximum(height,n);
        int[] rightMax=getrightmaximum(height,n);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int h=Math.min(leftMax[i], rightMax[i])-height[i];
            sum=sum+h;
        }
        return sum;
    }
}


 /**int n=height.length;
        int ans=0,add=0;
        int area=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                add=add+height[j];
                if(height[j]>=height[i]){
                    int length=Math.min(height[i], height[j]);
                    int breadth=j-1;
                    area=(length*breadth)-2;
                }
                ans=area-add;
            }
        }
        return ans; **/