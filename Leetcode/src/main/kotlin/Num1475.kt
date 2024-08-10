fun main() {
//    val prices = intArrayOf(8,4,6,2,3)
//    val prices = intArrayOf(1,2,3,4,5)
    val prices = intArrayOf(10,1,1,6)
    println(finalPrices(prices))
}

fun finalPrices(prices: IntArray): IntArray {
    var startIndex = 0
    val res = IntArray(prices.size)
    var isFound = false

    prices.forEachIndexed { index, i ->
        startIndex = index
        isFound = false
        if ((index + 1) < prices.size) {
            for (j in (startIndex + 1) until prices.size) {
                if (prices[index] >= prices[j]) {
                    isFound = true
                    res[index] = prices[index] - prices[j]
                    break
                }
            }
            if (!isFound) {
                res[index] = i
            }
        } else {
            res[index] = i
        }
    }

    return res
}