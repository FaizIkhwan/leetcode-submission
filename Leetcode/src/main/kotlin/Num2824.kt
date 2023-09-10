fun main() {
    val nums = listOf(-6,2,5,-2,-7,-1,3)
    val target = -2
    println(countPairs(nums, target))
}

fun countPairs(nums: List<Int>, target: Int): Int {
    var res = 0
    nums.forEachIndexed { i, num ->
        nums.forEachIndexed { j, num2 ->
            if (i < j && nums[i] + nums[j] < target) {
                res++
            }
        }
    }
    return res
}