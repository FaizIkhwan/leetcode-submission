fun main() {
//    val hours: IntArray = intArrayOf(0,1,2,3,4)
//    val target = 2
        val hours: IntArray = intArrayOf(5,1,4,2,2)
        val target = 6
    println(numberOfEmployeesWhoMetTarget(hours, target))
}

fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
    var res = 0
    hours.forEach {
        if (it >= target) {
            res++
        }
    }
    return res
}