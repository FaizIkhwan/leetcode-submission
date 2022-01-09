class Num14 {
    fun main() {
        val input = arrayOf("dog","racecar","car")
        println(longestCommonPrefix(input))
    }

    fun longestCommonPrefix(strs: Array<String>): String {
        var res = ""
        var temp = ""
        if (strs.isNotEmpty()) {
            strs[0].forEach lit@{ character ->
                temp += character
                strs.forEach {
                    if (!it.startsWith(temp)) {
                        return@lit
                    }
                }
                res = temp
            }
        }

        return res
    }
}