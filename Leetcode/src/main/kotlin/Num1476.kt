fun main() {
    val rectangle = arrayOf(
        intArrayOf(1,2,1),
        intArrayOf(4,3,4),
        intArrayOf(3,2,1),
        intArrayOf(1,1,1),
    )
    var obj = SubrectangleQueries(rectangle)
    println(obj.getValue(0,2))
    obj.updateSubrectangle(0, 0, 3, 2, 5)
    println(obj.toString())
}

class SubrectangleQueries(var rectangle: Array<IntArray>) {

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        rectangle.forEachIndexed { indexRow, rows ->
            rows.forEachIndexed { indexColumn, item ->
                if ((indexRow >= row1 && indexColumn >= col1) && (indexRow <= row2 && indexColumn <= col2)) {
                    rectangle[indexRow][indexColumn] = newValue
                }
            }
        }
    }

    fun getValue(row: Int, col: Int): Int {
        return rectangle[row][col]
    }

    override fun toString(): String {
        var str = ""
        rectangle.forEachIndexed { indexRow, rows ->
            rows.forEachIndexed { indexColumn, item ->
                str += "$item "
            }
            str += "\n"
        }
        return str
    }
}