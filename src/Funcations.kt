import com.sun.source.tree.ImportTree

fun main() {

    //Functions in Kotlin
    val result = sumOfNumber(5,3)
    println(result)

    val getResult = sumOfNum(32,45)
    println(getResult)

    val getDefult = defAr(b = 56)
    println(getDefult)
}

//Custom Function in Kotlin
fun sumOfNumber(a:Int, b:Int): Int{
   return a+b
}

//same function
fun sumOfNum(a:Int, b: Int) = a+b


//Default  Argument
fun defAr(a:Int = 10,b:Int) = a + b