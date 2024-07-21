fun main() {
    val numbers: IntArray = intArrayOf(2,7,11,15)
    val target = 9
    println(twoSum(numbers, target))
}

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1

    while (left < right) {
        if (numbers[left] + numbers[right] > target) {
            right -= 1
        } else if (numbers[left] + numbers[right] < target) {
            left += 1
        } else if (numbers[left] + numbers[right] == target) {
            return intArrayOf(left + 1, right + 1)
        }
    }

    return intArrayOf()
}