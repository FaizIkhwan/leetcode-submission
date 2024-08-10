fun main() {
//    val s = "(()())(())"
//    val s = "(()())(())(()(()))"
    val s = "()()"
    println(removeOuterParentheses(s))
}

fun removeOuterParentheses(s: String): String {
    val stack = ArrayDeque<String>()
    var res = ""
    var tempString = ""
    s.forEach {
        tempString += it
        when (it) {
            '(' -> {
                stack.add("(")
            }
            ')' -> {
                stack.removeLast()
                if (stack.isEmpty()) {
                    if (tempString.isNotEmpty()) {
                        res += (tempString.substring(1, tempString.length - 1))
                        tempString = ""
                    }
                }
            }
        }
    }
    return res
}