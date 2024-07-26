fun main() {
//    val word = "abcdefd"
    val word = "abcd"
//    val ch = 'd'
    val ch = 'z'
    println(reversePrefix(word, ch))
}

fun reversePrefix(word: String, ch: Char): String {
    var temp = ""
    var isFound = false
    var indexx = 0
    run breaking@ {
        word.forEachIndexed { index, c ->
            temp += c
            if (c == ch) {
                indexx = index
                isFound = true
                return@breaking
            }
        }
    }

    if (isFound) {
        return temp.reversed() + word.substring(indexx + 1, word.length)
    } else {
        return word
    }
}