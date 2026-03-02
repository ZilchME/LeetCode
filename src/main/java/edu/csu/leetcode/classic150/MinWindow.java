package edu.csu.leetcode.classic150;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.cn/problems/minimum-window-substring/?envType=study-plan-v2&envId=top-interview-150
public class MinWindow {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        int cnt = map.size();
        int left = 0, right = 0;
        int n = s.length();
        int minLength = n + 1;
        String ans = "";
        while (right < n) {
            char rightChar = s.charAt(right++);
            if (map.containsKey(rightChar)) {
                if (map.merge(rightChar, -1, Integer::sum) == 0) {
                    cnt--;
                }
            }
            while (cnt == 0) {
                if (right - left < minLength) {
                    ans = s.substring(left, right);
                    minLength = right - left;
                }
                char leftChar = s.charAt(left++);
                if (map.containsKey(leftChar)) {
                    if (map.merge(leftChar, 1, Integer::sum) == 1) {
                        cnt++;
                    }
                }
            }
        }
        return ans;
    }
}
