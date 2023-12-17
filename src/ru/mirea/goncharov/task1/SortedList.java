package ru.mirea.goncharov.task1;

import java.util.Arrays;

public class SortedList {
    private ListNode head;

    public void insert(int value) {
        if (head == null) {
            head = new ListNode(new int[]{value});
        } else {
            head = insertSorted(head, value);
        }
    }

    private ListNode insertSorted(ListNode node, int value) {
        if (node.values[node.values.length - 1] == 0) {
            node.values[findEmptyIndex(node.values)] = value;
            Arrays.sort(node.values);
        } else {
            ListNode newNode = new ListNode(new int[]{value});
            newNode.next = node;
            return newNode;
        }

        return node;
    }

    private int findEmptyIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public ListNode getHead() {
        return head;
    }
}
