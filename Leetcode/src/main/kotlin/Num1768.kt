fun main() {
    val word1 = "abc"
    val word2 = "pqr"
    println(mergeAlternately(word1, word2))
}

fun mergeAlternately(word1: String, word2: String): String {
    var res = ""
    var word1Index = 0
    var word2Index = 0
    var longestWord = ""
    var shortestWord = ""

    if (word1.length > word2.length) {
        longestWord = word1
        shortestWord = word2
    } else {
        longestWord = word2
        shortestWord = word1
    }

    longestWord.forEachIndexed { index, c ->
        if (index % 2 == 0) {
            res += (word1[word1Index++])
        } else {
            res += (word2[word2Index++])
        }

        if (res.length == (shortestWord.length * 2)) {
            res += (longestWord.substring(Math.max(word1Index, word2Index), longestWord.length - 1))
        }
    }

    return res
}