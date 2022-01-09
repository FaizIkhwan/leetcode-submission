class Num20 {
    fun main() {
//        val input = "()"
//        val input = "]"
//        val input = "["
//        val input = "(])"
//        val input = "()[]{}"
//        val input = "(()[]{})"
        val input = "(]"
        println(isValid(input))
    }

    fun isValid(s: String): Boolean {
        val stack = arrayListOf<String>()

        s.forEach {
            if (it.toString() == "(" || it.toString() == "[" || it.toString() == "{") {
                stack.add(it.toString())
            } else {
                if (stack.isEmpty() ||
                    stack.last() != "(" && it.toString() == ")" ||
                    stack.last() != "[" && it.toString() == "]" ||
                    stack.last() != "{" && it.toString() == "}") {
                    return false
                }
                stack.removeAt(stack.size - 1)
            }
        }
        return stack.isEmpty()
    }
}