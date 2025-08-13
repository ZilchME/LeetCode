package edu.csu.leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0, target, candidates, ans, path);
        return ans;
    }

    private void dfs(int i, int target, int[] candidates, List<List<Integer>> ans, List<Integer> path) {
        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (i >= candidates.length || target < 0) {
            return;
        }
        dfs(i + 1, target, candidates, ans, path);
        path.add(candidates[i]);
        dfs(i, target - candidates[i], candidates, ans, path);
        path.remove(path.size() - 1);
    }
}