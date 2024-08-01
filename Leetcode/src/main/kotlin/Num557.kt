fun main() {
//    val words = "Let's take LeetCode contest"
    val words = "Mr Ding"
    println(reverseWords(words))
}

fun reverseWords(s: String): String {
    val words = s.split(" ")
    var res = ""
    words.forEach {
        res += (it.reversed() + " ")
    }
    return res.trim()
}