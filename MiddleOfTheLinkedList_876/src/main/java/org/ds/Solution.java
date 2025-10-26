package org.ds;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static ListNode middleNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode middle = head;
        while (middle != null) {
            list.add(middle.val);
            middle = middle.next;
        }
        int middleIndex = list.size() / 2;
        int index = 0;
        ListNode temp = head;

        while (index < middleIndex) {
            temp = temp.next;
            index++;
        }
        return temp;
    }
}