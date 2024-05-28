package Oops

class Sum {
    constructor(a: Int, b: Int) {
            val c = a+b
            println(c)
    }

    constructor(a: Double, b: Double){
        val c = a+b
        println(c)
    }
}

fun main() {

    var addSum = Sum(10,15)
    var addDoubleSum = Sum(2.2,3.0                        )

}