fun main() {
    val n = 5
    println(countBits(n))
}

fun countBits(n: Int): IntArray {
    val res = IntArray(n + 1)
    for (i in 0..n) {
        val binary = i.toString(2)
        res[i] = binary.count { it == '1' }
    }
    return res
}