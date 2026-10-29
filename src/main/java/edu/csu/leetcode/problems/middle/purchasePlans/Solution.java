package edu.csu.leetcode.problems.middle.purchasePlans;

public class Solution {
    /** 统计 a * x + b * y == n 且 x、y 均至少为 1 的整数方案数。 */
    public long countPlans(int n, int a, int b) {
        if (n < 0 || a <= 0 || b <= 0) {
            throw new IllegalArgumentException("总金额必须非负，单价必须为正数");
        }

        // 先各买一个，剩余金额允许两类商品分别购买零个或更多。
        long required = (long) a + b;
        if (required > n) {
            return 0;
        }
        int remaining = (int) (n - required);
        long[] dp = new long[remaining + 1];
        dp[0] = 1;

        // 商品在外层避免重复统计购买顺序；金额正序允许重复购买。
        for (int price : new int[]{a, b}) {
            for (int amount = price; amount <= remaining; amount++) {
                dp[amount] += dp[amount - price];
            }
        }
        return dp[remaining];
    }
}
