import model.ListNode;

public class Num21 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode head = res;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        if (list1 != null) {
            head.next = list1;
        } else if (list2 != null) {
            head.next = list2;
        }

        return res.next;
    }
}
