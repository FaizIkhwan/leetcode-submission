package model

class Stack {

    private val list = mutableListOf<Pair<Int, Int>>()

    fun push(value: Int) {
        list += value to minOf(value, list.lastOrNull()?.second ?: value)
    }

    fun pop() {
        list.removeAt(list.lastIndex)
    }

    fun top(): Int = list.last().first

    fun getMin(): Int = list.last().second
}