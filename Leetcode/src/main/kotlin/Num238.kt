fun main() {
    val nums = intArrayOf(1,2,3,4)
//    val nums = intArrayOf(-1,1,0,-3,3)
    println(productExceptSelf(nums))
}

fun productExceptSelf(nums: IntArray): IntArray {
    val res = IntArray(nums.size)
    val prefixList = IntArray(nums.size)
    val postfixList = IntArray(nums.size)
    var currentValuePrefix = 1
    var currentValuePostfix = 1

    nums.forEachIndexed { index, i ->
        currentValuePrefix *= i
        prefixList[index] = currentValuePrefix

        currentValuePostfix *= nums[nums.size - 1 - index]
        postfixList[nums.size - 1 - index] = currentValuePostfix
    }

    nums.forEachIndexed { index, i ->
        val prefix = if (index == 0) 1 else prefixList[index - 1]
        val postfix = if (index == (nums.size - 1)) 1 else postfixList[index + 1]
        res[index] = prefix * postfix
    }

    return res
}