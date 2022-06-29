val column = listOf("name", "age", "address")
val rows = listOf(
    listOf("John", 18, false),
    listOf("Jane", 18),
    listOf("Jenny", 17, "Singapore"),
    listOf("Jack", 17, "Singapore", false)
)

data class Person(val name: String, val age: Int, val address: String)

fun main(args: Array<String>) {
    val people = column.joinWith(rows) // Transforms columns and rows into a list of people
    println(people)
}

fun List<String>.joinWith(obj: List<List<Any>>): List<Person> {
    return obj.mapIndexedNotNull { index, row ->
        try {
            val name = row[this.indexOf("name")] as? String ?: throw TypeCastException("It is not String")
            val age = row[this.indexOf("age")] as? Int ?: throw TypeCastException("It is not String")
            val address = row[this.indexOf("address")] as? String ?: throw TypeCastException("It is not String")
            Person(
                name = name,
                age = age,
                address = address,
            )
        } catch (e: Exception) {
            null
        }
    }
}