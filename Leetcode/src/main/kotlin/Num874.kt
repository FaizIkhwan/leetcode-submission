fun main() {
//    val commands = intArrayOf(4,-1,3)
//    val obstacles = arrayOf<IntArray>()
//    val commands = intArrayOf(4,-1,4,-2,4)
//    val obstacles = arrayOf(intArrayOf(2,4))
//    val commands = intArrayOf(6,-1,-1,6)
//    val obstacles = arrayOf<IntArray>()
//    val commands = intArrayOf(-2,8,3,7,-1)
//    val obstacles = arrayOf(intArrayOf(-4,-1), intArrayOf(1,-1), intArrayOf(1,4), intArrayOf(5,0), intArrayOf(4,5), intArrayOf(-2,-1), intArrayOf(2,-5), intArrayOf(5,1), intArrayOf(-3,-1), intArrayOf(5,-3))
//    val commands = intArrayOf(-2,-1,-2,3,7)
//    val obstacles = arrayOf(intArrayOf(1,-3), intArrayOf(2,-3), intArrayOf(4,0), intArrayOf(-2,5), intArrayOf(-5,2), intArrayOf(0,0), intArrayOf(4,-4), intArrayOf(-2,-5), intArrayOf(-1,-2), intArrayOf(0,2))
    val commands = intArrayOf(2,2,5,-1,-1)
    val obstacles = arrayOf(intArrayOf(-3,5), intArrayOf(-2,5), intArrayOf(3,2), intArrayOf(-5,0), intArrayOf(-2,0), intArrayOf(-1,5), intArrayOf(5,-3), intArrayOf(0,0), intArrayOf(-4,4), intArrayOf(-3, 4))
    println(robotSim(commands, obstacles))
}

fun robotSim(commands: IntArray, obstacles: Array<IntArray>): Int {
    var direction = "n" // n, s, w, e
    var coordinate = arrayOf(0, 0)
    var max = Int.MIN_VALUE
    var distance = 0
    val obstacles = obstacles.map { (x, y) -> x to y }.toSet()
    var hasMoved = false

    commands.forEach {
        if (it > 0) {
            when (direction) {
                "n" -> {
                    for (i in coordinate[1] .. coordinate[1] + it) {
                        if (obstacles.contains(Pair(coordinate[0], i)) && (Pair(coordinate[0], i) != Pair(0, 0) || hasMoved)) break
                        coordinate = arrayOf(coordinate[0], i)
                    }
                }
                "s" -> {
                    for (i in coordinate[1] downTo coordinate[1] - it) {
                        if (obstacles.contains(Pair(coordinate[0], i)) && (Pair(coordinate[0], i) != Pair(0, 0) || hasMoved)) break
                        coordinate = arrayOf(coordinate[0], i)
                    }
                }
                "w" -> {
                    for (i in coordinate[0] downTo  coordinate[0] - it) {
                        if (obstacles.contains(Pair(i, coordinate[1])) && (Pair(i, coordinate[1]) != Pair(0, 0) || hasMoved)) break
                        coordinate = arrayOf(i, coordinate[1])
                    }
                }
                "e" -> {
                    for (i in coordinate[0] .. coordinate[0] + it) {
                        if (obstacles.contains(Pair(i, coordinate[1])) && (Pair(i, coordinate[1]) != Pair(0, 0) || hasMoved)) break
                        coordinate = arrayOf(i, coordinate[1])
                    }
                }
            }
            hasMoved = true
            distance = (coordinate[0] * coordinate[0]) + (coordinate[1] * coordinate[1])
            max = Math.max(max, distance)
        } else if (it == -1) {
            when (direction) {
                "n" -> {
                    direction = "e"
                }
                "s" -> {
                    direction = "w"
                }
                "w" -> {
                    direction = "n"
                }
                "e" -> {
                    direction = "s"
                }
            }
        } else if (it == -2) {
            when (direction) {
                "n" -> {
                    direction = "w"
                }
                "s" -> {
                    direction = "e"
                }
                "w" -> {
                    direction = "s"
                }
                "e" -> {
                    direction = "n"
                }
            }
        }
    }
    return max
}