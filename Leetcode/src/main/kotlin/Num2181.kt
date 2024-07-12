import model.ListNode

fun main() {
    val listNode = ListNode(0)
    listNode.next = ListNode(3)
    listNode.next?.next = ListNode(1)
    listNode.next?.next?.next = ListNode(0)
    listNode.next?.next?.next?.next = ListNode(4)
    listNode.next?.next?.next?.next?.next = ListNode(5)
    listNode.next?.next?.next?.next?.next?.next = ListNode(2)
    listNode.next?.next?.next?.next?.next?.next?.next = ListNode(0)
//    val listNode = ListNode(0)
//    listNode.next = ListNode(1)
//    listNode.next?.next = ListNode(0)
//    listNode.next?.next?.next = ListNode(3)
//    listNode.next?.next?.next?.next = ListNode(0)
//    listNode.next?.next?.next?.next?.next = ListNode(2)
//    listNode.next?.next?.next?.next?.next?.next = ListNode(2)
//    listNode.next?.next?.next?.next?.next?.next?.next = ListNode(0)
    print(mergeNodes(listNode))
}

fun mergeNodes(head: ListNode?): ListNode? {
    val res = ListNode(0)
    var resNew = res
    var temp = head?.next
    var total = 0
    while (temp != null) {
        if (temp.`val` == 0) {
            if (total != 0) {
                resNew.next = ListNode(total)
                resNew = resNew.next!!
            }
            total = 0
        } else {
            total += temp.`val`
        }

        temp = temp.next
    }
    return res.next
}