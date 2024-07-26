fun main() {
//    val nums = intArrayOf(7,8,3,4,15,13,4,1)
//    val nums = intArrayOf(1,9,8,3,10,5)
    val nums = intArrayOf(1,2,3,7,8,9)
    println(minimumAverage(nums))
}

fun minimumAverage(nums: IntArray): Double {
    nums.sort()
    val averageList = arrayListOf<Double>()
    nums.forEachIndexed { index, i ->
        averageList.add((nums[index] + nums[nums.size - 1 - index]) / 2.0)
    }
    var minimum = Double.MAX_VALUE
    averageList.forEach {
        if (it < minimum) {
            minimum = it
        }
    }
    return minimum
}