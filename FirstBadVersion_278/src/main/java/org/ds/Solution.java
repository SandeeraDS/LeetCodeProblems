package org.ds;/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution {
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        boolean found = false;
        int firstBadVersion = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            found = isBadVersion(mid);
            if (found) {
                firstBadVersion = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return firstBadVersion;
    }

    private static boolean isBadVersion(int n) {
        return n == 1;
    }
}