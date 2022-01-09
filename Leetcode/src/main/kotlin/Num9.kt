class Num9 {
    fun main() {
        val input = 10
        println(isPalindrome(input))
    }

    fun isPalindrome(x: Int): Boolean {
        val reversed = x.toString().reversed()
        return reversed == x.toString()
    }
}