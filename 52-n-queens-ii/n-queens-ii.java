class Solution {
    int N;
    int count=0;
    ArrayList<List<String>> result=new ArrayList<>();
    public boolean isValid(char[][] board, int row, int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--)
        {
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1, j=col+1; i>=0 && j<N; i--, j++)
        {
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public void solve(char[][] board, int row)
    {
        if(row==N){
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                temp.add(new String(board[i]));
            }
            result.add(temp);
            count++;
            return;
        }
        for(int col=0;col<N;col++)
        {
            if(isValid(board, row, col)){
                board[row][col]='Q';
                solve(board, row+1);
                board[row][col]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        N=n;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
        solve(board,0);
        return count;
    }
}