fun main() {
    val n = 4
    println(isStrictlyPalindromic(n))
}

fun isStrictlyPalindromic(n: Int): Boolean {
    for (i in 2..(n - 2)) {
        val binary = n.toString(i)
        val reversedBinary = binary.reversed()
        if (binary != reversedBinary) {
            return false
        }
    }
    return true
}