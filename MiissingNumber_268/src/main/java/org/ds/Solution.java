package org.ds;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int missingNumber(int[] nums) {

        int len =  nums.length;
        int totalSum = len * (len + 1) / 2;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
        }

        return totalSum - currentSum;

//        int len = nums.length;
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i <= len; i++) {
//            map.put(i, -1);
//        }
//
//        for (int num : nums) {
//            map.put(num, 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == -1) {
//                return entry.getKey();
//            }
//        }
//        return -1;
    }
}