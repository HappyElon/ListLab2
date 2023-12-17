package ru.mirea.goncharov.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();

        sortedList.insert(3);
        sortedList.insert(1);
        sortedList.insert(4);
        sortedList.insert(2);
        sortedList.insert(5);

        printList(sortedList.getHead());
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.println(Arrays.toString(node.values));
            node = node.next;
        }
    }
}

