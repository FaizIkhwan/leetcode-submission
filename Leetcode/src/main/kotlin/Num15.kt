fun main() {
//    val nums: IntArray = intArrayOf(0,1,1)
//    val nums: IntArray = intArrayOf(0,0,0)
    val nums: IntArray = intArrayOf(-1,0,1,2,-1,-4,-2,-3,3,0,4) // sorted: -4, -3, -2, -1, -1, 0, 0, 1, 2, 3, 4
//    val nums: IntArray = intArrayOf(-1,0,1,2,-1,-4) // sorted: -4, -1, -1, 0, 1, 2
    println(threeSum(nums))
}

fun threeSum(nums: IntArray): List<List<Int>> {
    val res = mutableSetOf<List<Int>>()
    nums.sort()
    nums.forEachIndexed { index, i ->
        var left = 0
        var right = nums.size - 1

        while (left < right) {
            if (index == left) {
                left++
            } else if (index == right) {
                right--
            }

            if (nums[left] + nums[right] + i > 0) {
                right--
            } else if (nums[left] + nums[right] + i < 0) {
                left++
            } else if (nums[left] + nums[right] + i == 0) {
                val temp = arrayListOf(nums[left], nums[right], i)
                temp.sort()
                if (!res.contains(temp) && (index != left && index != right && left != right)) {
                    res.add(temp)
                }
                left++
            }
        }
    }
    return res.toList()
}