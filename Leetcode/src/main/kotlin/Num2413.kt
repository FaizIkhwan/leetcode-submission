fun main() {
    val n = 6
    println(smallestEvenMultiple(n))
}

fun smallestEvenMultiple(n: Int): Int {
    if (n % 2 == 0) {
        return n
    } else {
        return n * 2
    }
}