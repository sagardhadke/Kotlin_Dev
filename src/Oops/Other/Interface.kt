package Oops.Other

interface MyInter{

    var x : Int
    fun test()

}

class MyInterImp : MyInter{

    override var x: Int = 10

    override fun test() {
        println("This is Overriding testing Method")
    }

}