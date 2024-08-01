fun main() {
    val pivot = 10
    val nums = intArrayOf(9,12,5,10,14,3,10)
    println(pivotArray(nums, pivot))
}

fun pivotArray(nums: IntArray, pivot: Int): IntArray {
    val left = arrayListOf<Int>()
    val right = arrayListOf<Int>()
    val mid = arrayListOf<Int>()
    nums.forEachIndexed { index, i ->
        if (i < pivot) {
            left.add(i)
        } else if (i > pivot) {
            right.add(i)
        } else {
            mid.add(i)
        }
    }
    return (left + mid + right).toIntArray()
}