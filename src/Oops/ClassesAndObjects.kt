package Oops


class Student{

    var name = "Sagar"
    var age = 19
    var about = "Software Engineer"

    fun printDetails(){
        println("My name is $name")
        println("My age is $age")
        println("About me is $about")
    }

}

fun main() {


    var myObj = Student()
    myObj.printDetails()

    println("End")

    var myObj2 = Student()
    myObj2.name ="Sagar Dhadke"
    myObj2.age = 20
    myObj2.about = "Android Developer"
    myObj2.printDetails()

}