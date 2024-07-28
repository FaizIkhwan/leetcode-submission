fun main() {
//    val words = "Let's take LeetCode contest"
//    val words = "egcfe"
//    val words = "abcd"
//    val words = "seven"
//    val words = "az"
    val words = "a"
    println(makeSmallestPalindrome(words))
}

fun makeSmallestPalindrome(s: String): String {
    var res = ""
    s.forEachIndexed { index, c ->
        if (s[index] > s[s.length - 1 - index]) {
            res += s[s.length - 1 - index]
        } else {
            res += s[index]
        }
    }
    return res
}