import model.ListNode

class Num2 {
    fun main() {
//        val l1 = listOf(ListNode(2), ListNode(4), ListNode(3))
//        val l2 = listOf(ListNode(5), ListNode(6), ListNode(4))
//        val l1 = listOf(ListNode(0))
//        val l2 = listOf(ListNode(0))
//        var l1 = ListNode(2)
//        l1.next = ListNode(4)
//        l1.next?.next = ListNode(3)
//
//        val l2 = ListNode(5)
//        l2.next = ListNode(6)
//        l2.next?.next = ListNode(4)

        var l1 = ListNode(9)

        val l2 = ListNode(1)
        l2.next = ListNode(9)
        l2.next?.next = ListNode(9)
        l2.next?.next?.next = ListNode(9)
        l2.next?.next?.next?.next = ListNode(9)
        l2.next?.next?.next?.next?.next = ListNode(9)
        l2.next?.next?.next?.next?.next?.next = ListNode(9)
        l2.next?.next?.next?.next?.next?.next?.next = ListNode(9)
        l2.next?.next?.next?.next?.next?.next?.next?.next = ListNode(9)

        println(addTwoNumbers(l1, l2))
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1String = ""
        var l2String = ""

        var tempListNode1 = l1
        var tempListNode2 = l2

        while (tempListNode1 != null) {
            l1String += tempListNode1.`val`
            tempListNode1 = tempListNode1.next
        }

        while (tempListNode2 != null) {
            l2String += tempListNode2.`val`
            tempListNode2 = tempListNode2.next
        }

        val l1StringReversed = l1String.toCharArray().reversed().joinToString("").toBigInteger()
        val l2StringReversed = l2String.toCharArray().reversed().joinToString("").toBigInteger()

        val sum = l1StringReversed + l2StringReversed
        val splitedSum = sum.toString().toCharArray()
        var res: ListNode? = null
        splitedSum.forEachIndexed { index, obj ->
            val newNode = ListNode(obj.toString().toInt())
            newNode.next = res
            res = newNode
        }
        return res
    }
}