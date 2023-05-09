fun main(args: Array<String>) {
//    val s = "A man, a plan, a canal: Panama"
    val s = "race a car"
//    val s = " "
    println(isPalindrome(s))
}

fun isPalindrome(s: String): Boolean {
    val alteredString = s.replace("[^a-zA-Z0-9]".toRegex(), "").toLowerCase()
    val reversed = alteredString.reversed()
    return reversed == alteredString
}