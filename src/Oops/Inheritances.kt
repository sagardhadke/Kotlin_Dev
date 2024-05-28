package Oops

open class Manna{    //parent
    var house = "25000.sq.feet"
    fun myCompany(){
        println("Chocolate Factory")
        println("Dry Fruits Factory")
        println("My All Money")
    }
}

class Gampu : Manna(){

    fun itsMe(){
        println(house)
    }

}


open class Parent{

    var house = 1000

    fun allProperties(){
        println("House")
        println("Watch")
        println("Mobile")
    }

}

class Child : Parent(){

    fun meChild(){
        allProperties()
        house = 1500
        println(house)

    }

}

fun main() {


    var myObj2 = Gampu()
    myObj2.itsMe()
    myObj2.myCompany()

    var myObj = Child()
//    myObj.allProperties()
    myObj.house
    myObj.meChild()

}