package edu.csu.leetcode.middle;

import java.util.List;
import java.util.ArrayList;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(1, new ArrayList<>(), ans, n, k);
        return ans;
    }

    private void dfs(int i, List<Integer> route, List<List<Integer>> ans, int n, int k) {
        if (k == 0) {
            ans.add(new ArrayList<>(route));
            return;
        }
        for (int j = i; j <= n; j++) {
            route.add(j);
            dfs(j + 1, route, ans, n, k - 1);
            route.remove(route.size() - 1);
        }
    }
}
