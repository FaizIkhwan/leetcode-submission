import kotlin.math.min

fun main() {
    val grid = arrayOf(
        intArrayOf(3,0,8,4),
        intArrayOf(2,4,5,7),
        intArrayOf(9,2,6,3),
        intArrayOf(0,3,1,0),
    )
    println(maxIncreaseKeepingSkyline(grid))
}

fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
    var res = 0
    val rowsCache : HashMap<Int, Int> = HashMap()
    val columnCache : HashMap<Int, Int> = HashMap()
    grid.forEachIndexed { i, rows ->
        rows.forEachIndexed { j, height ->
            // Get max height row
            var maxRow = rows.first()
            if (rowsCache[j] == null) {
                rows.forEachIndexed { index, row ->
                    if (row > maxRow) {
                        maxRow = row
                    }
                }
                rowsCache[j] = maxRow
            } else {
                maxRow = rowsCache[j]!!
            }

            // Get max height column
            var maxColumn = grid.first()[j]
            if (columnCache[j] == null) {
                grid.forEachIndexed { index, row ->
                    if (row[j] > maxColumn) {
                        maxColumn = row[j]
                    }
                }
                columnCache[j] = maxColumn
            } else {
                maxColumn = columnCache[j]!!
            }

            val minimum = min(maxColumn, maxRow)
            if (minimum > grid[i][j]) {
                res += (minimum - grid[i][j])
            }
        }
        rowsCache.clear()
    }
    return res
}
