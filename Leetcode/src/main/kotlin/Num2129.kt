class Num2129 {
    fun main() {
        val input = "First leTTeR of EACH Word"
        println(capitalizeTitle(input))
    }

    fun capitalizeTitle(title: String): String {
        val words = title.split(" ")
        var res = ""
        words.forEach {
            if (it.length > 2) {
                val temp = it.toLowerCase()
                val uppercased = temp.capitalize()
                res += "$uppercased "
            } else {
                val temp = it.toLowerCase()
                res += "$temp "
            }
        }
        return res.trim()
    }
}