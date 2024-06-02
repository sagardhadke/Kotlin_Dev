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

//Run-Time Polymorphism

open class Animal(){
    open fun sound(){
        println("Animal make a Sound!")
    }
}

class Dog : Animal(){
    override fun sound() {
        println("Dog Barks!")
    }
}

fun main() {

    //Compile-Time Polymorphism
    val math = Polymorphism()
    println(math.add(5,10))
    println(math.add(2.3,6.30))


    //Run-Time Polymorphism
    val myObj = Dog()
    myObj.sound()

}