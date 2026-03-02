package edu.csu.leetcode.classic150;

import java.util.*;

// https://leetcode.cn/problems/substring-with-concatenation-of-all-words/?envType=study-plan-v2&envId=top-interview-150

public class FindSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = words.length;
        int m = words[0].length();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < m && s.length() >= m * n + i; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.merge(word, 1, Integer::sum);
            }
            int cnt = map.size();
            for (int left = i, right = i; right + m <= s.length(); ) {
                String sub = s.substring(right, right += m);
                if (map.containsKey(sub) && map.merge(sub, -1, Integer::sum) == 0) {
                    cnt--;
                }
                if (right - left > m * n) {
                    sub = s.substring(left, left += m);
                    if (map.containsKey(sub) && map.merge(sub, 1, Integer::sum) == 1) {
                        cnt++;
                    }
                }
                if (right - left >= m * n && cnt == 0) {
                    ans.add(left);
                }
            }
        }
        return ans;
    }
}
