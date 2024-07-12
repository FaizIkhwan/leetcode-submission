fun main() {
//    val n = 10
//    val m = 3
//    val n = 5
//    val m = 6
    val n = 5
    val m = 1
    println(differenceOfSums(n, m))
}

fun differenceOfSums(n: Int, m: Int): Int {
    var num1 = 0
    var num2 = 0
    for (i in 1..n) {
        if (i % m == 0) {
            num1 += i
        } else {
            num2 += i
        }
    }
    return num2 - num1
}