class Num26 {
    fun main() {
        val input = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        println(removeDuplicates(input))
    }

    fun removeDuplicates(nums: IntArray): Int {
        val numDict = arrayListOf<Int>()
        var res = 0

        nums.forEach {
            if (!numDict.contains(it)) {
                res++
                numDict.add(it)
            }
        }

        return res
    }
}