fun main() {
    val n = "27346209830709182346"
    println(minPartitions(n))
}

fun minPartitions(n: String): Int {
    var max = Int.MIN_VALUE
    n.forEach {
        val temp = it.toString().toInt()
        if (temp > max) {
            max = temp
        }
    }
    return max
}