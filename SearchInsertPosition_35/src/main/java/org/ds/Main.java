package org.ds;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(Solution.searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(Solution.searchInsert(new int[]{1,3,5,6}, 7));
        System.out.println(Solution.searchInsert(new int[]{1,3,5,6}, 0));
        System.out.println(Solution.searchInsert(new int[]{1,3}, 2));
    }
}