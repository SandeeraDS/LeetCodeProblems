package org.ds;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] a = new int[]{0,1,0,3,12};
        Solution.moveZeroes(a);
        int [] b = new int[]{0};
        Solution.moveZeroes(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}