fun main() {
//    val s = "zbax"
//    val k = 2
//    val s = "iiii"
//    val k = 1
    val s = "leetcode"
    val k = 2
    println(getLucky(s, k))
}

fun getLucky(s: String, k: Int): Int {
    var sConcat = ""
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    s.forEach {
        sConcat += (alphabet.indexOf(it) + 1).toString()
    }
    var temp = 0
    for (value in 0 until k) {
        temp = 0
        sConcat.forEach {
            temp += it.toString().toInt()
        }
        sConcat = temp.toString()
    }
    return temp
}