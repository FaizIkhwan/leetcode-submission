import model.ListNode

fun main() {
    val listNode = ListNode(18)
    listNode.next = ListNode(6)
    listNode.next?.next = ListNode(10)
    listNode.next?.next?.next = ListNode(3)
    println(insertGreatestCommonDivisors(listNode))
}

fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
    var res = ListNode(0)
    var resNew = res
    var temp = head
    var tempForCalculation = ListNode(0)
    var count = 0
    while (temp != null) {
        if (count == 0) {
            resNew.next = ListNode(temp.`val`)
            resNew = resNew.next!!
            tempForCalculation = ListNode(temp.`val`)
        } else {
//            println("temp.`val`: ${temp.`val`} | tempForCalculation.`val`: ${tempForCalculation.`val`}")
            val gcd = findGCD(temp.`val`, tempForCalculation.`val`)
//            println("222 gcd: $gcd")
//            println("2221 before resNew: $resNew")
//            println("2221 before res: $res")
            resNew.next = ListNode(gcd)
//            println("2221 after resNew: $resNew")
//            println("2221 after resNew.next: ${resNew.next}")
//            println("2221 after res: $res")
            resNew = resNew.next!!
//            println("2221 after after resNew: $resNew")
//            println("2221 after after res: $res")

            resNew.next = ListNode(temp.`val`)
//            println("2222 resNew: $resNew")
//            println("2222 res: $res")
            resNew = resNew.next!!

            tempForCalculation = ListNode(temp.`val`)
        }
        count++
        temp = temp.next
    }
    return res.next
}

private fun findGCD(number1: Int, number2: Int): Int {
    var num1 = number1
    var num2 = number2
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1
}