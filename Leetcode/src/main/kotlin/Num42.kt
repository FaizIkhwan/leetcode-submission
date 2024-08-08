fun main() {
//    val height: IntArray = intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)
    val height: IntArray = intArrayOf(4,2,0,3,2,5)
    println(trap(height))
}

fun trap(height: IntArray): Int {
    var res = 0
    var left = 0
    var right = height.size - 1
    var maxL = height[left]
    var maxR = height[right]

    while (left < right) {
        if (maxL <= maxR) {
            left++
            maxL = Math.max(maxL, height[left])
            res += (maxL - height[left])
        } else {
            right--
            maxR = Math.max(maxR, height[right])
            res += (maxR - height[right])
        }
    }

    return res
}