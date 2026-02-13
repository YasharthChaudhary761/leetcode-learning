class Solution {
    //ArrayList<List<String>> result=new ArrayList<>();
    public boolean isValid(char[][] board, int row, int col, char digit){
        for(int i=0;i<9;i++){   // for row checking
            if(board[row][i]==digit) return false;
        }

        for(int i=0;i<9;i++){    // for column checking
            if(board[i][col]==digit) return false;
        }
        int start_i=row/3*3;
        int start_j=col/3*3;
        for(int k=0;k<3;k++)
        {
            for(int l=0;l<3;l++)
            {
                if(board[start_i+k][start_j+l]==digit)
                {
                    return false;
                }
            }
        }
        return true; 
    }


    public boolean solve(char[][] board)
    {
        for(int row=0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {
                if(board[row][col]=='.')
                {
                   for(char digit='1'; digit<='9' ;digit++)
                    {
                        if(isValid(board, row, col, digit))
                        {
                          board[row][col]=digit;
                          if(solve(board)) return true; //////////
                          board[row][col]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }



    public void solveSudoku(char[][] board) {
        solve(board);
    }
}