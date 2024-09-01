fun main() {
//    val original = intArrayOf(1,2,3,4)
//    val m = 2
//    val n = 2
//    val original = intArrayOf(1,2,3)
//    val m = 1
//    val n = 3
    val original = intArrayOf(1,2)
    val m = 1
    val n = 1
    println(construct2DArray(original, m, n))
}

fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
    if (original.size != (m * n)) {
        return arrayOf()
    }

    var index = 0
    val res = Array(m) { i -> intArrayOf() }
    for (i in 0 until m) {
        val temp = IntArray(n)
        for (j in 0 until n) {
            temp[j] = original[index++]
            print("${temp[j]} ")
        }
        res[i] = temp
        println()
    }
    return res
}