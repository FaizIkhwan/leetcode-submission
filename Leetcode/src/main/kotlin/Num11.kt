fun main() {
    val height = intArrayOf(1,8,6,2,5,4,8,3,7)
//    val height = intArrayOf(1,1)
    println(maxArea(height))
}

fun maxArea(height: IntArray): Int {
    var max = Int.MIN_VALUE
    var left = 0
    var right = height.size - 1
    var area = 0

    while (left < right) {
        area = (right - left) * Math.min(height[left], height[right])
        max = Math.max(max, area)

        if (height[left] > height[right]) {
            right--
        } else {
            left++
        }
    }

    return max
}