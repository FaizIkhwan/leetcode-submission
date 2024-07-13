fun main() {
    val words = arrayOf("leet","code")
    val x = 'e'
    println(findWordsContaining(words, x))
}

fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
    val res = arrayListOf<Int>()
    words.forEachIndexed { index, s ->
        if (s.contains(x)) {
            res.add(index)
        }
    }
    return res
}