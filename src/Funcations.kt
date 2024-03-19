fun main() {

    //Functions in Kotlin
    val result = sumOfNumber(5,3)
    println(result)

    val getResult = sumOfNum(32,45)
    println(getResult)
}

//Custom Function in Kotlin
fun sumOfNumber(a:Int, b:Int): Int{
   return a+b
}

//same function
fun sumOfNum(a:Int, b: Int) = a+b
