fun main() {
//    val words = arrayOf("abc","car","ada","racecar","cool")
//    val words = arrayOf("notapalindrome","racecar")
    val words = arrayOf("def","ghi")
    println(firstPalindrome(words))
}

fun firstPalindrome(words: Array<String>): String {
    val res = ""
    words.forEach {
        val temp = it
        if (it == temp.reversed()) {
            return it
        }
    }
    return res
}