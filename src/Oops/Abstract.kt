package Oops


abstract class AnimalAb{

    abstract fun speak()

}


class Cat : AnimalAb(){
    override fun speak() {
        println("Cat is speaking!")
    }

}

fun main() {
    val animal = Cat()
    println(animal.speak())
}