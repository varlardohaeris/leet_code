package org.been.leetcode;

public class LIS_300 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int len = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    len = Math.max(len, dp[j] + 1);
                }
            }
            dp[i] = len;
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] input = {10, 9, 2, 5, 3, 7, 101, 18};
        int anwser = new LIS_300().lengthOfLIS(input);
        System.out.println(anwser);

    }
}
