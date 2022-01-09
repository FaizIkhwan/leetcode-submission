class Num58 {
    fun main() {
        val input = "luffy is still joyboy"
        println(lengthOfLastWord(input))
    }

    fun lengthOfLastWord(s: String): Int {
        val trimmedString = s.trim()
        val words = trimmedString.split(" ")
        return words.last().length
    }
}