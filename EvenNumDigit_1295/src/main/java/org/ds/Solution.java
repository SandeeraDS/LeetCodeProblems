package org.ds;

class Solution {
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int length = String.valueOf(num).length();
            if (length % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}