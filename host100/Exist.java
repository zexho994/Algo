/**
 * @author : zexho
 * @created : 2022-05-29
**/
public class Exist{
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(process(board,word,0,i,j)) return true;
            }
        }
        return false;
    }

    public boolean process(char[][] board,String word,int idx,int row,int col){
        if(idx == word.length()) return true;
        if(row < 0 || row == board.length) return false;
        if(col < 0 || col == board[0].length) return false;
        if(board[row][col] == '0') return false;
        if(board[row][col] != word.charAt(idx)) return false;

        char t = board[row][col];
        board[row][col] = '0';
        boolean res = process(board,word,idx+1,row-1,col) || process(board,word,idx+1,row,col-1)
                || process(board,word,idx+1,row+1,col) || process(board,word,idx+1,row,col+1);
        board[row][col] = t;
        return res;
    }
}
