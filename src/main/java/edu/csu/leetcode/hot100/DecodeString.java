package edu.csu.leetcode.hot100;

public class DecodeString {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                sb.append(c);
            } else {
                int cnt = 0;
                for (; ; i++) {
                    char num = s.charAt(i);
                    if ('0' <= num && num <= '9') {
                        cnt = cnt * 10 + (num - '0');
                    } else {
                        break; //数字部分结束
                    }
                }
                // 此时 i 处一定是 '['，i + 1 处是递归起始
                int k = 1;
                int startIdx = i + 1;
                while (k > 0) {
                    i++;
                    if (s.charAt(i) == ']') {
                        k--;
                    } else if (s.charAt(i) == '[') {
                        k++;
                    }
                }
                // 循环结束后 i 为 ']' 的索引
                sb.append(decodeString(s.substring(startIdx, i)).repeat(cnt));
            }
        }
        return sb.toString();
    }
}
