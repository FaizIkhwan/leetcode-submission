fun main() {
    val command = "(al)G(al)()()G"
    println(interpret(command))
}

fun interpret(command: String): String {
    val res: StringBuilder = StringBuilder()
    var i = 0
    while (i < command.length) {
        if (command[i] == 'G') {
            res.append("G")
            i++
            continue
        } else if (command[i] == '(' && command[i + 1] == ')') {
            res.append("o")
            i += 2
            continue
        } else {
            res.append("al")
            i += 4
            continue
        }
    }
    return res.toString()
}