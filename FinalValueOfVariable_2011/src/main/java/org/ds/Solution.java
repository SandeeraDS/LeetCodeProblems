package org.ds;

class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String operation : operations) {
            if (operation.charAt(0) == '+') {
                sum += 1;
            } else if (operation.charAt(0) == '-') {
                sum -= 1;
            } else if (operation.charAt(2) == '+') {
                sum += 1;
            } else if (operation.charAt(2) == '-') {
                sum -= 1;
            }
        }

        return sum;
    }
}