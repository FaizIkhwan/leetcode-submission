fun main() {
    val s = "zaz"
    println(scoreOfString(s))
}

fun scoreOfString(s: String): Int {
    var res = 0
    for ((index, value) in s.withIndex()) {
        if (index == s.length - 1) {
            return res
        }
        res += Math.abs(value.code - s[index + 1].code)
    }
    return res
}