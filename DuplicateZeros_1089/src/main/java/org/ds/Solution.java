package org.ds;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public static int[] duplicateZeros(int[] arr) {
        int validZeroCount = 0;
        int lastIndex = arr.length - 1;
        for (int i = 0; i <= lastIndex - validZeroCount; i++) {
            if (arr[i] == 0) {
                if (i == lastIndex - validZeroCount) {
                    arr[lastIndex] = 0;
                    lastIndex--;
                    break;
                }
                validZeroCount++;
            }
        }
        if (validZeroCount == 0) {
            return arr;
        }

        for (int i = lastIndex - validZeroCount; i >= 0; i--) {
            if (arr[i] == 0 && validZeroCount > 0) {
                arr[i + validZeroCount] = arr[i];
                validZeroCount--;
                arr[i + validZeroCount] = arr[i];
            } else {
                arr[i + validZeroCount] = arr[i];
            }
        }

        return arr;
    }


//    public static int[] duplicateZeros(int[] arr) {
//        Stack<Integer> st = new Stack<>();
//        int validZeroCount = 0;
//        int lastIndex = arr.length - 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0 && (i + (validZeroCount * 2)) < lastIndex) {
//                validZeroCount++;
//                st.push(i);
//            }
//        }
//        if(validZeroCount == 0){
//            return arr;
//        }
//        for (int i = lastIndex-validZeroCount; i >= 0; i--) {
//            if (arr[i] == 0 && st.peek() == i) {
//                arr[i + validZeroCount] = arr[i];
//                validZeroCount--;
//                arr[i + validZeroCount] = arr[i];
//                st.pop();
//            } else {
//                arr[i + validZeroCount] = arr[i];
//            }
//        }
//
//        return arr;
//    }
}