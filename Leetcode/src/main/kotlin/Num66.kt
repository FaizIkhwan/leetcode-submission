import java.math.BigInteger

class Num66 {
    fun main() {
        val input = intArrayOf(4,3,2,1)
        println(plusOne(input))
    }

    fun plusOne(digits: IntArray): IntArray {
        val digitsBigInteger = digits.joinToString("").toBigInteger()
        val addedDigit = digitsBigInteger.add(BigInteger.ONE)
        val addedCharArray = addedDigit.toString()
        val arrayOfInt = addedCharArray.toCharArray()
        val res = arrayListOf<Int>()
        arrayOfInt.forEach {
            res.add(it.toString().toInt())
        }
        return res.toIntArray()
    }
}