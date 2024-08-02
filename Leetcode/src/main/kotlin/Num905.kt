fun main() {
    val nums = intArrayOf(3,1,2,4)
//    val nums = intArrayOf(0)
    println(sortArrayByParity(nums))
}

fun sortArrayByParity(nums: IntArray): IntArray {
    val even = arrayListOf<Int>()
    val odd = arrayListOf<Int>()

    nums.forEachIndexed { index, i ->
        if (i % 2 == 0) {
            even.add(i)
        } else {
            odd.add(i)
        }
    }

    val res = even + odd
    return res.toIntArray()
}