package Backtracking;

public class sudokoSolver {

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(board);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solveSudoku(char[][] board) {

        int n = board.length;
         helper( board, n);
//        System.out.println(isSafe(4, board, 8, 5, n));
        return;
    }

    public static boolean helper(char[][] board, int n){




        for(int i=0; i<n; i++){

            for (int j = 0; j < n; j++) {


                if(board[i][j] == '.'){
                    for(int k=1; k<=9; k++){
                        if(isSafe(k, board, i, j, n)){
                            board[i][j] = (char)(k+'0');

                            if(helper(board, n) == true){
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }


    public static boolean isSafe(int num, char[][] board, int row, int col, int n){

        char ch = (char)(num+'0');

        // row
        for(int i=0; i<n; i++){
            if(board[row][i] == ch){
                return false;
            }
        }

        // column
        for(int i=0; i<n; i++){
            if(board[i][col] == ch){
                return false;
            }
        }

        // 3*3 box
        int si = -1, sj = -1;
        if(row < 3){
            if(col < 3){
                si=0;sj=0;
            }
            else if(col < 6){
                si=0;sj=3;
            }
            else{
                si=0;sj=6;
            }
        }
        else if( row < 6){
            if(col < 3){
                si=3;sj=0;
            }
            else if(col < 6){
                si=3;sj=3;
            }
            else{
                si=3;sj=6;
            }
        }
        else{
            if(col < 3){
                si=6;sj=0;
            }
            else if(col < 6){
                si=6;sj=3;
            }
            else{
                si=6;sj=6;
            }
        }

        for(int i=si; i<si+3; i++){

            for(int j=sj; j<sj+3; j++){
                if(board[i][j] == ch){
                    return false;
                }
            }
        }

        return true;
    }
}
