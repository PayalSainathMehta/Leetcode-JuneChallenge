
public class SurroundedRegions {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0) return;
        if(board.length < 2 || board[0].length < 2) return;
        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < m; i++)
        {
            if(board[i][0] == 'O') 
                dfs(board, i, 0);
            if(board[i][n-1] == 'O')
                dfs(board, i, n-1);
        }   
    
        for(int j = 1; j < n; j++)
        {
            if(board[0][j] == 'O') 
                dfs(board, 0, j);
            if(board[m-1][j] == 'O')
                dfs(board, m-1, j);
        }   
        
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '*') board[i][j] = 'O';
            }
               
    }
    
    private void dfs(char[][] board, int r, int c){
        if( r < 0 || c < 0 || r > board.length - 1 || c > board[0].length - 1 || board[r][c] != 'O')               return;
        board[r][c] = '*';
        dfs(board, r+1, c);
        dfs(board, r-1, c);
        dfs(board, r, c+1);
        dfs(board, r, c-1);
    }
    

}
