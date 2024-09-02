fun main() {
//    val chalk = intArrayOf(5,1,5)
//    val k = 22
//    val chalk = intArrayOf(3,4,1,2)
//    val k = 25
    val chalk = intArrayOf(1,2,3,5)
    val k = 1000000000
    println(chalkReplacer(chalk, k))
}

fun chalkReplacer(chalk: IntArray, k: Int): Int {
    var totalChalkNeeded: Long = 0

    for (studentChalk in chalk) {
        totalChalkNeeded += studentChalk
    }

    var remainingChalk = (k % totalChalkNeeded).toInt()

    for (i in chalk.indices) {
        if (remainingChalk < chalk[i]) {
            return i
        }
        remainingChalk -= chalk[i]
    }

    return 0
}