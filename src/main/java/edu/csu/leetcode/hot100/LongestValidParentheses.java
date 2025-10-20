package edu.csu.leetcode.hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        Deque<Integer> stk = new ArrayDeque<>();
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt++;
            if (str[i] == '(') {
                stk.push(i + 1);
            } else {
                if (stk.isEmpty()) {
                    ans = Math.max(ans, cnt - 1);
                    cnt = 0;
                } else {
                    stk.poll();
                }
            }
        }
        int idx = stk.isEmpty() ? 0 : stk.poll();
        ans = Math.max(ans, cnt - idx);
        return ans;
    }
}
