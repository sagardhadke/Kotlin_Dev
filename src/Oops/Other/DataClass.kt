package Oops.Other

data class MyPerson(var name : String, var age : Int, var about : String){

}


fun main() {
    var myPersonObj = MyPerson("Sagar",19,"Android Developer")

    println(myPersonObj.name)
    println(myPersonObj.age)
    println(myPersonObj.about)


    var myperson2 = myPersonObj.copy("Gampu",24,"Food Factory Owner")
    println(myperson2.name)
    println(myperson2.age)
    println(myperson2.about)

}