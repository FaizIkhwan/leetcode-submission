import model.ListNode

class Num21 {
    fun main() {
        var l1 = ListNode(3)
        l1.next = ListNode(4)
        l1.next?.next = ListNode(9)

        val l2 = ListNode(1)
        l2.next = ListNode(5)
        l2.next?.next = ListNode(9)

        println(mergeTwoLists(l1, l2))
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        return null
    }
}
