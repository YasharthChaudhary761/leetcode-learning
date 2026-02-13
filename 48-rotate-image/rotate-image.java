class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++)
        {
            reverse(matrix[i]);
        }
    }
    public void transpose(int[][] matrix)
    {
        for(int r=0;r<matrix.length;r++)
        {
            for(int c=r;c<matrix.length;c++)
            {
                int temp=matrix[r][c];
                matrix[r][c]=matrix[c][r];
                matrix[c][r]=temp;
            }
        }
    }
    public void reverse(int[] matrix)
    {
       int i=0;
       int j=matrix.length-1;
       while(i<j)
       {
          int temp=matrix[i];
          matrix[i]=matrix[j];
          matrix[j]=temp;
          i++;
          j--;
       }
    }
}