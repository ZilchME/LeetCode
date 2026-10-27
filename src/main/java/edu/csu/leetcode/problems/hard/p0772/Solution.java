package edu.csu.leetcode.problems.hard.p0772;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    int i = 0;

    public int calculate(String s) {
        return dfs(s);
    }

    private int dfs(String s) {
        int num = 0;
        char op = '+';
        Deque<Integer> st = new ArrayDeque<>();
        while (i <= s.length()) {
            char c = i == s.length() ? '+' : s.charAt(i);
            i++;
            if (c == ' ') continue;
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '(') {
                num = dfs(s);
            } else {
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
                }
                num = 0;
                op = c;
                if (c == ')') break;
            }
        }
        int res = 0;
        while (!st.isEmpty()) res += st.pop();
        return res;
    }
}
