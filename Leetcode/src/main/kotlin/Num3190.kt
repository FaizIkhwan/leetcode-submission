fun main() {
//    val nums: IntArray = intArrayOf(1, 2, 3, 4)
    val nums: IntArray = intArrayOf(3, 6, 9)
    println(minimumOperations(nums))
}

fun minimumOperations(nums: IntArray): Int {
    var res = 0
    nums.forEach {
        if (it % 3 != 0) {
            res++
        }
    }
    return res
}