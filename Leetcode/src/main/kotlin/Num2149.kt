fun main() {
    val nums = intArrayOf(3,1,-2,-5,2,-4)
//    val nums = intArrayOf(-1, 1)
    println(rearrangeArray(nums))
}

fun rearrangeArray(nums: IntArray): IntArray {
    val positiveNums = arrayListOf<Int>()
    val negativeNums = arrayListOf<Int>()
    var positiveIndex = 0
    var negativeIndex = 0
    nums.forEach {
        if (it > 0) {
            positiveNums.add(it)
        } else {
            negativeNums.add(it)
        }
    }

    val res = IntArray(nums.size)
    nums.forEachIndexed { index, i ->
        if (index % 2 == 0) {
            res[index] = positiveNums[positiveIndex]
            positiveIndex++
        } else {
            res[index] = negativeNums[negativeIndex]
            negativeIndex++
        }
    }
    return res
}