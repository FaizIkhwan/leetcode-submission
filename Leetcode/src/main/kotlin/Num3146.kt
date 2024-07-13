fun main() {
    val s = "abcde"
    val t = "edbac"
    println(findPermutationDifference(s, t))
}

fun findPermutationDifference(s: String, t: String): Int {
    var res = 0
    s.forEachIndexed { sIndex, sC ->
        t.forEachIndexed { tIndex, tC ->
            if (sC == tC) {
                res += Math.abs(sIndex - tIndex)
                return@forEachIndexed
            }
        }
    }
    return res
}