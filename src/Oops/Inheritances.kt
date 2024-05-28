package Oops

open class Manna{    //parent
   open var house = "25000.sq.feet"
   open fun myCompany(){
        println("Chocolate Factory")
        println("Dry Fruits Factory")
        println("My All Money")
    }
}

class Gampu : Manna(){

    override var house: String
        get() = super.house
        set(value) {}

    override fun myCompany() {
        super.myCompany()
    }

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