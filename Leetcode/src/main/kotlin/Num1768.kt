fun main() {
//    val word1 = "abc"
//    val word2 = "pqr"
//    val word1 = "ab"
//    val word2 = "pqrs"
    val word1 = "abcd"
    val word2 = "pq"
    println(mergeAlternately(word1, word2))
}

fun mergeAlternately(word1: String, word2: String): String {
    var res = ""
    var index = 0

    while (res.length != (word1.length + word2.length)) {
        if (index < word1.length) {
            res += word1[index]
        }
        if (index < word2.length) {
            res += word2[index]
        }
        index++
    }

    return res
}