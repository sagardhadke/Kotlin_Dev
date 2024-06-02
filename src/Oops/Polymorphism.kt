package Oops

//Compiler-Time Polymorphism
class Polymorphism{
    fun add(a:Int,b:Int) : Int{
        return a+b
    }

    fun add(a:Double,b:Double) : Double{
        return a+b
    }
}

fun main() {

    val math = Polymorphism()
    println(math.add(5,10))
    println(math.add(2.3,6.30))

}