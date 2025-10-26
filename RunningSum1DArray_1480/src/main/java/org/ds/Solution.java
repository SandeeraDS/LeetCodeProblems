package org.ds;

class Solution {
    public static int[] runningSum(int[] nums) {

        for (int j = 0; j < nums.length; j++) {
            if (j - 1 >= 0) {
                nums[j] = nums[j - 1] + nums[j];
            }
        }
        return nums;
    }
}