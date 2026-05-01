package com.morgachev.aleksey.algo.l01_sorts.mergeSort;

public class T6_LeetCode_148 {
    public static void main(String[] args) {
        ListNode node = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode sorted = sortList(node);
        //Вывод результата
        ListNode cur = sorted;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static ListNode sortList(ListNode head) {
        // базовый случай
        if (head == null || head.next == null) {
            return head;
        }

        //Найти середину списка
        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null; // разрываем на два списка

        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(rightHead);
        return merge(leftSorted, rightSorted);
    }

    // функция для нахождения середины
    private static ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // реализация как в 21 задаче
    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }


        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }
}