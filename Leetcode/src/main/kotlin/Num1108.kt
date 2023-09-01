fun main() {
    val address = "1.1.1.1"
    println(defangIPaddr(address))
}

fun defangIPaddr(address: String): String {
    return address.replace(".", "[.]")
}