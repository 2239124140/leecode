package com.founder.leecode.leecode.$202212.$20221206;

public class $7exist {


    public static boolean exist(char[][] board, String word) {
        int h = board.length, w = board[0].length;
        boolean[][] visited = new boolean[h][w];
        for (int k = 0; k < board.length; k++) {
            for (int l = 0; l < board[0].length; l++) {
                boolean exist = exist(board, visited, k, l, word, 0);
                if(exist){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean exist(char[][] board, boolean[][] visited, int i, int j, String word, int charAt) {
        if(board[i][j]!=word.charAt(charAt)){
           return false;
        }
        if(word.length()-1==charAt){
           return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] direction : directions) {
            int newi = i + direction[0], newj = j + direction[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = exist(board, visited, newi, newj, word, charAt + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }

    public static void main(String[] args) {

        char[][] board   = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        System.out.println(exist(board, word));

    }
}
