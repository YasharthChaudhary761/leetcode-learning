class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int length=Math.min(height[i], height[j]);
            int width=j-i;
            int area=length*width;
            max=Math.max(max, area);

            if(height[i]<height[j]) ++i;
            else --j;
        }
        return max;
    }
}


/**int n=height.length;
        int max1=0;
        
   
        for(int i=0;i<n;i++){
            for(int j=n-1;j>0;j--){
               int  length=Math.min(height[i],height[j]);
               int  width=j-i;
               int  area=length*width;
               max1=Math.max(max1,area);
               // ans=Math.max(max1,max2);
            }
        }
        return max1;
    }**/