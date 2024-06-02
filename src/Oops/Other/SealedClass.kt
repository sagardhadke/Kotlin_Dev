package Oops.Other


sealed class Ball

class RedBall (val color : String = "Red Ball") : Ball(){

}

class GreenBall (val color : String = "Green Ball") : Ball(){

}

class OrangeBall (val color : String = "Orange Ball") : Ball(){

}

fun main() {


    val value : Ball = GreenBall("Green Ball")

    when (value){
        is RedBall -> println("This is ${value} Ball")
        is GreenBall -> println("This is ${value} Ball")
        is OrangeBall -> println("This is ${value} Ball")

        else -> println("Ball Not Found")
    }

}