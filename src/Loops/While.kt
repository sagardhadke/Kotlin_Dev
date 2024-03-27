package Loops

import java.awt.SystemColor.text

fun main() {

    var a = 0
    while (a <= 5) {
        println(a)
        a++
    }

    ////    while loop with function
    var b = 0
    while (condition(b = b)) {
        println(b)
        b++
    }

}

fun condition(b : Int) : Boolean {
    return  b<=5
}