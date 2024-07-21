fun main() {
    val pref: IntArray = intArrayOf(5,2,0,3,1)
    println(findArray(pref))
}

fun findArray(pref: IntArray): IntArray {
    val res = IntArray(pref.size)
    var total = 0
    pref.forEachIndexed { index, i ->
        if (index == 0) {
            total = i
        } else {
            println("total: $total")
            println("i: $i")
            total = total xor i
            println("after total: $total")
        }
        res[index] = total
        println("final: $total")
    }
    return res
}