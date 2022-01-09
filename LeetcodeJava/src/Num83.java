import model.ListNode;

import java.util.ArrayList;

public class Num83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        System.out.println(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> dict = new ArrayList<>();
        boolean isFirstTime = true;
        ListNode temp = new ListNode(head.val);
        dict.add(head.val);
        while (head.next != null) {
            System.out.println("head: " + head);
            if (!dict.contains(head.next.val)) {
                System.out.println("first");
                dict.add(head.next.val);
                if (!isFirstTime) {
                    temp.next = head;
                } else {
                    isFirstTime = false;
                }
                head = head.next;
            } else {
                System.out.println("second");
                head.next = head.next.next;
            }
        }
        return temp;
    }
}
