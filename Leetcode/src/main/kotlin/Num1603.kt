fun main() {
    val parkingSystem = ParkingSystem(1, 1, 0)
    println(parkingSystem.addCar(1)) // return true because there is 1 available slot for a big car
    println(parkingSystem.addCar(2)) // return true because there is 1 available slot for a medium car
    println(parkingSystem.addCar(3)) // return false because there is no available slot for a small car
    println(parkingSystem.addCar(1)) // return false because there is no available slot for a big car. It is already occupied.
}

class ParkingSystem(var big: Int,var medium: Int,var small: Int) {

    fun addCar(carType: Int): Boolean {
        when(carType) {
            1 -> {
                return big-- > 0
            }
            2 -> {
                return medium-- > 0
            }
            3 -> {
                return small-- > 0
            }
        }
        return false
    }
}