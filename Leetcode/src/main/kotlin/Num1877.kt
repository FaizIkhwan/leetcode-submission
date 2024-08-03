fun main() {
//    val words = "Let's take LeetCode contest"
//    val words = "egcfe"
//    val words = "abcd"
//    val words = "seven"
//    val words = "az"
//    val nums = intArrayOf(3,5,2,3)
    val nums = intArrayOf(3,5,4,2,4,6)
    println(minPairSum(nums))
}

fun minPairSum(nums: IntArray): Int {
    nums.sort()
    var left = 0
    var right = nums.size - 1
    var max = Int.MIN_VALUE
    var sum = 0

    while (left < right) {
        sum = nums[left++] + nums[right--]
        max = Math.max(sum, max)
    }

    return max
}