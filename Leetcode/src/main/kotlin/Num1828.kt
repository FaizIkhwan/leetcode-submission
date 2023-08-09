import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    // points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
    val points = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(3, 3),
        intArrayOf(5, 3),
        intArrayOf(2, 2),
    )
    val queries = arrayOf(
        intArrayOf(2, 3, 1),
        intArrayOf(4, 3, 1),
        intArrayOf(1, 1, 2),
    )
    println(countPoints(points, queries))
}

fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
    var res = intArrayOf()
    queries.forEach { query ->
        var count = 0
        points.forEach { point ->
            val distance = sqrt((query[0] - point[0]).toDouble().pow(2) + (query[1] - point[1]).toDouble().pow(2))
            if (distance <= query[2]) {
                count++
            }
        }
        res += count
        count = 0
    }
    return res
}