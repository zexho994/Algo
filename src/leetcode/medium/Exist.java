package leetcode.medium;

public class Exist {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length < 1) {
            return false;
        }
        boolean[][] memo = new boolean[board.length][board[0].length];
        boolean flag = false;
        for(int i = 0 ; i < board.length && !flag; i++){
            for(int j =0 ; j < board[0].length && !flag;j++){
                flag = seek(board,i,j,word,0,memo);
            }
        }
        return flag;
    }

    public boolean seek(char[][] board, int r, int c, String str,int idx, boolean[][] memo) {
        if(idx == str.length()){
            return true;
        }
        if(r >= board.length || c >= board[0].length || r <0 || c < 0){
            return false;
        }
        if(memo[r][c]){
            return false;
        }
        if(board[r][c] == str.charAt(idx)){
            memo[r][c] = true;
            idx++;
            boolean flag = seek(board,r+1,c,str,idx,memo)
                    || seek(board,r-1,c,str,idx,memo)
                    || seek(board,r,c+1,str,idx,memo)
                    || seek(board,r,c-1,str,idx,memo);
            memo[r][c] = false;
            return flag;
        }
        return false;
    }

    public static void main(String[] args) {
        Exist exist = new Exist();
        char[][] cha = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean flag = exist.exist(cha, "BCCED");
        System.out.println(flag);
    }
}
