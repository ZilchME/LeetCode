package edu.csu.leetcode.classic150;

// https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/description/

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        for (int n : nums) {
            if (p < 2 || nums[p - 2] != n) {
                nums[p++] = n;
            }
        }
        return p;
    }
}
