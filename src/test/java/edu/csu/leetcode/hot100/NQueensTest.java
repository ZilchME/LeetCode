package edu.csu.leetcode.hot100;

import org.junit.Test;

public class NQueensTest {
    @Test
    public void nQueensTest() {
        NQueens nQueens = new NQueens();
        int n = 4;
        System.out.println(nQueens.solveNQueens(n));
    }

}
