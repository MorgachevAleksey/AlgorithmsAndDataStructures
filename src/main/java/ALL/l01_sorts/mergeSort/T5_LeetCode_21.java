package ALL.l01_sorts.mergeSort;

//Слить два отсортированных списка
public class T5_LeetCode_21 {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode node3 = mergeTwoLists(node1, node2);

        ListNode cur = node3;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
