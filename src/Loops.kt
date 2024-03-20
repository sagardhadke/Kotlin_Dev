fun main() {

    //Loops In Kotlin

    var num = 0
    while (num < 10){
        println(num)
         num++
    }

    //while loop with function
    var a = 0
    while (condition(a=a)){
        println(a)
        a++
    }

    var number = 0
    do {
        println(number)
        number += 10
    }while (number<=100)

}


fun condition(a : Int) : Boolean {
    return  a<=5
}