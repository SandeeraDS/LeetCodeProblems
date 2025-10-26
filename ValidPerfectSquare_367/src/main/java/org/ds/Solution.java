package org.ds;

class Solution {
    public static boolean isPerfectSquare(int num) {

        if(num == 1)
            return true;
        int start = 1;
        int end = num/2;
        long sqrt;
        while(start <= end) {
            int mid = start + (end - start)/2;
            sqrt = (long)mid * mid;
            if(sqrt == (long)num) {
                return true;
            } else if(sqrt > num) {
                end = mid - 1;
            } else if(sqrt < num) {
                start = mid + 1;
            }
        }
        return false;
    }
}