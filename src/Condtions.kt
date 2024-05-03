fun main() {
    ageVerify(18)

    //check number
   val checkSign = checkNumberSign(20)
    println(checkSign)
}

//age verification
fun ageVerify(age:Int){
    if (age < 18){
        println("Access Denied!")
    }

    //clean code
//    if (age > 18 || age == 18) println("Access Approved!")
    if (age >= 18) println("Access Approved!")

}


fun checkNumberSign(number : Int) : StringFun{
    return if (number > 0){
        "Positive"
    }else if (number < 0){
        "Negative"
    }else{
        "Zero"
    }
}










