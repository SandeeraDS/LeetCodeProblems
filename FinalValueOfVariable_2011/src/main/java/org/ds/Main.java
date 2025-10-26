package org.ds;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(Solution.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        System.out.println(Solution.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        System.out.println(Solution.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }
}