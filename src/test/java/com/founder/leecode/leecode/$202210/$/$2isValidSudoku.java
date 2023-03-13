package com.founder.leecode.leecode.$202210.$;

public class $2isValidSudoku {


    public static boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][10];
        int[][] coll = new int[9][10];
        int[][] table = new int[9][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char c = board[i][j];
                if(c=='.'){
                    continue;
                }
                int num = c - '0';
                int rownum = row[i][num];
                if(rownum==1){
                    return false;
                }
                int collnum = coll[j][num];
                if(collnum==1){
                    return false;
                }
                int tablenum = table[(i)/3*3+(j)/3][num];
                if(tablenum==1){
                    return false;
                }
                row[i][num] =1;
                coll[j][num]=1;
                table[(i)/3*3+(j)/3][num] =1;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        char[][]   board =
{{'5','3','.','.','7','.','.','.','.'}
,{'6','.','.','1','9','5','.','.','.'}
,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}};

        boolean validSudoku = isValidSudoku(board);
        System.out.println(validSudoku);


    }
}
