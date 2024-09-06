import model.ListNode

fun main() {
    val nums = intArrayOf(1,2,3)
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)
//    val nums = intArrayOf(1)
//    val head = ListNode(1)
//    head.next = ListNode(2)
//    head.next?.next = ListNode(1)
//    head.next?.next = ListNode(2)
//    head.next?.next = ListNode(1)
//    head.next?.next = ListNode(2)
//    val nums = intArrayOf(5)
//    val head = ListNode(1)
//    head.next = ListNode(2)
//    head.next?.next = ListNode(3)
//    head.next?.next = ListNode(4)
    println(modifiedList(nums, head))
}

fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
    val numsSet = nums.toSet()
    val res = ListNode(0)
    var resNew = res
    var tempListNode = head
    while(tempListNode != null) {
        if (!numsSet.contains(tempListNode.`val`)) {
            resNew.next = ListNode(tempListNode.`val`)
            resNew = resNew.next!!
        }
        tempListNode = tempListNode.next
    }
    return res.next
}