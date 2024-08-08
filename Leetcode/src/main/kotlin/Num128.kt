fun main() {
//    val nums: IntArray = intArrayOf(100,4,200,1,3,2)
    val nums: IntArray = intArrayOf(0,3,7,2,5,8,4,6,0,1)
//    val nums: IntArray = intArrayOf(0)
//    val nums: IntArray = intArrayOf(1, 10)
//    val nums: IntArray = intArrayOf()
    println(longestConsecutive(nums))
}

fun longestConsecutive(nums: IntArray): Int {
    val numsSet = nums.toHashSet()
    var max = 0
    val dict = mutableMapOf<Int, Int>()
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return 1
    numsSet.forEach {
        if (numsSet.contains(it - 1)) {
            var temp = 0
            if (dict.contains(temp + it)) {
                temp = dict.get(temp + it) ?: 0
            } else {
                while (numsSet.contains(temp + it)) {
                    temp++
                    dict.put(temp + it, temp)
                }
            }
            max = Math.max(max, temp)
        }
    }
    return max + 1
}