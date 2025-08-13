package edu.csu.leetcode.hot100;

public class WordSearch {
    private static final int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        char[] wordArray = word.toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j, 0, wordArray, visited, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int k, char[] wordArray, boolean[][] visited, char[][] board) {
        if (k == wordArray.length) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]
                || board[i][j] != wordArray[k]) {
            return false;
        }
        visited[i][j] = true;
        for (int[] dir : directions) {
            if (dfs(i + dir[0], j + dir[1], k + 1, wordArray, visited, board)) {
                return true;
            }
        }
        visited[i][j] = false;
        return false;
    }
}
