class Solution {
    int r,c;
    int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public boolean find(int idx, int i, int j, char[][] board, String word)
    {
        if(idx==word.length()) return true;
        if(i<0 || j<0 || i>=r || j>=c || board[i][j]=='&') return false;
        if(board[i][j]!=word.charAt(idx)) return false;
        char temp=board[i][j];
        board[i][j]='&';
        for(int [] d:dir)
        {
            int new_i=i+d[0];
            int new_j=j+d[1];
            if(find(idx+1, new_i, new_j, board, word)) return true;
        }
        board[i][j]=temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        r=board.length;
        c=board[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(board[i][j]==word.charAt(0) && find(0,i,j, board, word))
                {
                    return true;
                }
            }
        }
        return false;
    }
}