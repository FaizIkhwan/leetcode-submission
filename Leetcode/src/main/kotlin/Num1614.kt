fun main() {
//    val s = "(1+(2*3)+((8)/4))+1"
//    val s = "(1)+((2))+(((3)))"
    val s = "()(())((()()))"
    println(maxDepth(s))
}

fun maxDepth(s: String): Int {
    val stack = ArrayDeque<String>()
    var res = 0
    var temp = 0
    s.forEach {
        when (it) {
            '(' -> {
                stack.add("(")
                res = Math.max(res, ++temp)
            }
            ')' -> {
                stack.removeLast()
                temp--
            }
        }
    }
    return res
}