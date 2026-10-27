package edu.csu.leetcode.problems.hot100.p0079;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testWordSearchTest() {
        Solution solution = new Solution();
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "AB";
        System.out.println(solution.exist(board, word));
    }
}
