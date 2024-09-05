fun main() {
    val rolls = intArrayOf(3,2,4,3)
    val mean = 4
    val n = 2
    println(missingRolls(rolls, mean, n))
}

fun missingRolls(rolls: IntArray, mean: Int, n: Int): IntArray {
    var sum = 0
    rolls.forEach {
        sum += it
    }

    val balance = mean * (rolls.size + n) - sum

    if (balance > n * 6 || balance < n) {
        return intArrayOf()
    }

    val average = balance / n
    val extra = balance % n

    val res = IntArray(n) {it}

    for (i in 0 until n) {
        res[i] = average
    }

    for (i in 0 until extra) {
        res[i]++
    }
    return res
}