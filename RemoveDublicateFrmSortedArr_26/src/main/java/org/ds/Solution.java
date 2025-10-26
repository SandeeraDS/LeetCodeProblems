package org.ds;

import java.util.Arrays;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int updateIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[updateIndex] = nums[i];
                updateIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return updateIndex;
    }
}