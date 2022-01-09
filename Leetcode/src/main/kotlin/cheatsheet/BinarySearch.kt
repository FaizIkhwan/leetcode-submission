package cheatsheet

class BinarySearch {
    fun main() {
        val input = intArrayOf(5)
        val target = -5
        println(search(input, target))
    }

    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, 0, nums.size - 1, target)
    }

    fun binarySearch(arr: IntArray, start: Int, end: Int, target: Int): Int {
        if (arr.first() == target) return 0
        var sstart = start
        var eend = end
        while (sstart <= eend) {
            val mid = sstart + (eend - sstart) / 2
            if (arr[mid] == target) return mid
            if (target > arr[mid]) {
                sstart = mid + 1
            } else {
                eend = mid - 1
            }
        }
        return -1
    }
}