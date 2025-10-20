package edu.csu.leetcode.hot100;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] memo = new boolean[n + 1];
        memo[0] = true;
        for (int i = 0; i < n; i++) {
            if (!memo[i])
                continue;
            for (String word : wordDict) {
                int n2 = word.length();
                if (n2 > n - i)
                    continue;
                int j = 0;
                while (j < n2 && s.charAt(i + j) == word.charAt(j)) {
                    j++;
                }
                if (j == n2) {
                    memo[i + j] = true;
                }
            }
        }
        return memo[n];
    }
}
