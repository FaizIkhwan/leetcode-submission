class Num13 {
    fun main() {
        val input = "MCMXCIV"
        println(romanToInt(input))
    }

    fun romanToInt(s: String): Int {
        val romanList = listOf("I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M")
        val valueList = listOf(1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000)

        var currentValue = 0
        var tempValue = 0
        var currentChar = ""
        var tempChar = ""
        var lastChar = ""

        s.forEachIndexed { index, c ->
            currentValue += tempValue
            currentChar += c

            if (lastChar.isEmpty() ||  romanList.indexOf(currentChar) <= romanList.indexOf(lastChar)) {
                tempValue = valueList[romanList.indexOf(currentChar)]
                tempChar = c.toString()
            } else {
                currentValue -= tempValue
                tempChar += currentChar
                tempValue = valueList[romanList.indexOf(tempChar)]
                tempChar = ""
            }

            lastChar = c.toString()
            currentChar = ""
        }
        currentValue += tempValue

        return  currentValue
    }
}