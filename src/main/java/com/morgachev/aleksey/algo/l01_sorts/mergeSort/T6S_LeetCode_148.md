# Intuition
Сортировка слиянием для связного списка

# Approach
Т.к. мы не можем найти середину с помощью индексов:
Мы ищем середину с помощью двух указателей slow\fast с начала списка
fast движется в два раза быстрее slow, и когда он доходит до конца, slow указывает на середину

Далее стандартный алгоритм

# Complexity
- Time complexity:
  O(n * log 2(n))

- Space complexity:
  O(1)

# Code
```java []
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
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
```