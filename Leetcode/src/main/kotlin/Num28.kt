class Num28 {
    fun main() {
        val haystack = ""
        val needle = ""
        println(strStr(haystack, needle))
    }

    fun strStr(haystack: String, needle: String): Int {
        return haystack.indexOf(needle)
    }
}