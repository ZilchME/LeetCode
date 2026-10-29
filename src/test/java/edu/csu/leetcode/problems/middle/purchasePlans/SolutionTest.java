package edu.csu.leetcode.problems.middle.purchasePlans;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SolutionTest {
    @Test
    public void countsCombinationsWithoutPurchaseOrder() {
        assertEquals(2L, new Solution().countPlans(14, 2, 3));
    }

    @Test
    public void requiresAtLeastOneOfEach() {
        Solution solution = new Solution();
        assertEquals(0L, solution.countPlans(0, 2, 3));
        assertEquals(0L, solution.countPlans(4, 2, 3));
        assertEquals(1L, solution.countPlans(5, 2, 3));
        assertEquals(0L, solution.countPlans(8, 3, 4));
    }

    @Test
    public void keepsTypesDistinctWhenPricesAreEqual() {
        assertEquals(3L, new Solution().countPlans(8, 2, 2));
    }

    @Test
    public void handlesUnitPrices() {
        assertEquals(99L, new Solution().countPlans(100, 1, 1));
    }

    @Test
    public void avoidsOverflowWhenAddingPrices() {
        assertEquals(0L, new Solution().countPlans(Integer.MAX_VALUE,
                Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void rejectsInvalidArguments() {
        Solution solution = new Solution();
        assertThrows(IllegalArgumentException.class, () -> solution.countPlans(-1, 2, 3));
        assertThrows(IllegalArgumentException.class, () -> solution.countPlans(10, 0, 3));
        assertThrows(IllegalArgumentException.class, () -> solution.countPlans(10, 2, -3));
    }

    @Test
    public void matchesEnumerationForSmallBudgets() {
        Solution solution = new Solution();
        for (int n = 0; n <= 100; n++) {
            for (int a = 1; a <= 10; a++) {
                for (int b = 1; b <= 10; b++) {
                    long expected = 0;
                    for (int x = 1; x * a <= n; x++) {
                        int rest = n - x * a;
                        if (rest >= b && rest % b == 0) {
                            expected++;
                        }
                    }
                    assertEquals("n=" + n + ", a=" + a + ", b=" + b,
                            expected, solution.countPlans(n, a, b));
                }
            }
        }
    }
}
