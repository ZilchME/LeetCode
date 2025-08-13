package edu.csu.leetcode.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        // 每行一个Q，全排列Q的列号
        List<List<String>> ans = new ArrayList<>();
        int[] path = new int[n];
        boolean[] visited = new boolean[n];
        dfs(0, path, visited, ans);
        return ans;
    }

    private void dfs(int idx, int[] path, boolean[] visited, List<List<String>> ans) {
        if (idx == path.length) {
            ans.add(new ArrayList<>(genBoard(path)));
            return;
        }
        for (int j = 0; j < path.length; j++) {
            if (!visited[j] && check(idx, path, j)) {
                path[idx] = j;
                visited[j] = true;
                dfs(idx + 1, path, visited, ans);
                visited[j] = false;
            }
        }
    }

    private boolean check(int idx, int[] path, int j) {
        for (int row = 0; row < idx; row++) {
            int col = path[row];
            if (row - col == idx - j || row + col == idx + j) {
                return false;
            }
        }
        return true;
    }

    private List<String> genBoard(int[] path) {
        int n = path.length;
        char[] s = new char[n];
        List<String> board = new ArrayList<>(n);
        for (int k : path) {
            for (int j = 0; j < n; j++) {
                s[j] = j == k ? 'Q' : '.';
            }
            board.add(new String(s));
        }
        return board;
    }
}
