package edu.csu.leetcode.hot100;

import org.junit.Test;

public class WordSearchTest {
    @Test
    public void testWordSearchTest() {
        WordSearch solution = new WordSearch();
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "AB";
        System.out.println(solution.exist(board, word));
    }
}
