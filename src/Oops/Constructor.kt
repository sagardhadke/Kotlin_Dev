package Oops


//primary constructor
class Car constructor(
    var carName : String,
    var carType : String,
    var carColor : String,
    var carNumber : Int
    ){

    init {
//        println("Always print this init block in first")
        println("Data Loading progress...")
    }

    fun printingCarDetails(){
        println(carName)
        println(carType)
        println(carColor)
        println(carNumber)
    }
}

fun main() {

    var myCar = Car("Maruti","Petrol","Black",121)
    myCar.printingCarDetails()

    var myCar2 = Car("BMW","Disle","white",130)
    myCar2.printingCarDetails()

}