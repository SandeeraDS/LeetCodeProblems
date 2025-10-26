package org.ds;

class Solution {
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return x;
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqrt = (long) mid * mid;
            if (sqrt == x) {
                return mid;
            } else if (sqrt < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}