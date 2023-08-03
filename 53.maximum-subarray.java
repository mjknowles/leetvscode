/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public int maxSubArray(int[] nums) {
        var localMaxes = new int[nums.length];
        var runningMax = localMaxes[0] = nums[0];

        for (var i = 1; i < nums.length; i++) {
          runningMax = Math.max(nums[i] + runningMax, nums[i]);
          localMaxes[i] = (Math.max(localMaxes[i - 1], runningMax));   
        }

        return localMaxes[localMaxes.length - 1];
    }
}
// @lc code=end

