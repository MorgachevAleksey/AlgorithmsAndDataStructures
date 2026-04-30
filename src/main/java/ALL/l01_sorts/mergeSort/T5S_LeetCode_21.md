# Intuition
Задача слить два отсортированных списка


# Approach
Можно использовать классический алгоритм слияния
Идти с начала, поочередно сравнивать элементы из каждого списка и добавлять меньший элемент в результирующий список

# Complexity
- Time complexity:
  O(n)

- Space complexity:
  O(1) т.к. переиспользуются существующие узлы

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode current = result; //Ссылаются на один и тот же обьект!
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        while (list1 != null){
            current.next = list1;
            list1 = list1.next;
            current = current.next;
        }

        while (list2 != null){
            current.next = list2;
            list2 = list2.next;
            current = current.next;
        }

        return result.next; //Потому что у первого узла val == 0
    }
}
```