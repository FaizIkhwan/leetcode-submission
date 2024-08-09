fun main() {
//    val tokens = arrayOf("2","1","+","3","*")
//    val tokens = arrayOf("4","13","5","/","+")
    val tokens = arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")
    println(evalRPN(tokens))
}

fun evalRPN(tokens: Array<String>): Int {
    val stack = ArrayDeque<String>()
    tokens.forEach {
        when (it) {
            "+" -> {
                val a = stack.removeLast().toInt()
                val b = stack.removeLast().toInt()
                val c = b + a
                stack.add(c.toString())
            }
            "-" -> {
                val a = stack.removeLast().toInt()
                val b = stack.removeLast().toInt()
                val c = b - a
                stack.add(c.toString())
            }
            "*" -> {
                val a = stack.removeLast().toInt()
                val b = stack.removeLast().toInt()
                val c = b * a
                stack.add(c.toString())
            }
            "/" -> {
                val a = stack.removeLast().toInt()
                val b = stack.removeLast().toInt()
                val c = b / a
                stack.add(c.toString())
            }
            else -> {
                stack.add(it)
            }
        }
    }
    return stack.removeLast().toInt()
}