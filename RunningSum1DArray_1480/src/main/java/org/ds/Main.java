package org.ds;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(Solution.runningSum(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(Solution.runningSum(new int[]{3, 1, 2, 10, 1})));
    }
}