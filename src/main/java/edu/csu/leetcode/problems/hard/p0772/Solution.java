package edu.csu.leetcode.problems.hard.p0772;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    int i = 0;

    public int calculate(String s) {
        i = 0;
        return dfs(s);
    }

    private int dfs(String s) {
        int num = 0;
        int sign = 1;
        char op = '+';
        boolean expectNum = true;
        Deque<Integer> st = new ArrayDeque<>();
        while (i <= s.length()) {
            char c = i == s.length() ? '+' : s.charAt(i);
            i++;
            if (c == ' ') continue;
            // 一元正负号
            if (expectNum && (c == '+' || c == '-')) {
                if (c == '-') sign = -sign;
                continue;
            }
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
                expectNum = false;
            } else if (c == '(') {
                num = dfs(s);
                expectNum = false;
            } else {
                num *= sign;

                switch (op) {
                    case '+':
                        st.push(num);
                        break;
                    case '-':
                        st.push(-num);
                        break;
                    case '*':
                        st.push(st.pop() * num);
                        break;
                    case '/':
                        st.push(st.pop() / num);
                        break;
                }
                num = 0;
                sign = 1;
                op = c;
                expectNum = true;
                if (c == ')') break;
            }
        }
        int res = 0;
        while (!st.isEmpty()) res += st.pop();
        return res;
    }
}
