import model.Stack

fun main() {
    var obj = Stack()
    obj.push(1)
    obj.push(2)
    obj.pop()
    var param_3 = obj.top()
    var param_4 = obj.getMin()
}