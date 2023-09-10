fun main() {
    val n = 4421
    println(subtractProductAndSum(n))
}

fun subtractProductAndSum(n: Int): Int {
    val charArray = n.toString().toCharArray()
    var sum = 0
    var product = 1
    charArray.forEach {
        sum += it.toString().toInt()
        product *= it.toString().toInt()
    }
    return product - sum
}