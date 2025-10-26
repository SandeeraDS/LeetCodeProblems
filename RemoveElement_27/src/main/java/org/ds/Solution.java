package org.ds;

import java.util.Arrays;

class Solution {
    public static int removeElement(int[] nums, int val) {

        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                count++;
//            }
//        }
//        if (count == nums.length) {
//            return count;
//        }
        int updateIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[updateIndex] = nums[i];
                updateIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return updateIndex;

    }
}