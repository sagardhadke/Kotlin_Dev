package Loops

fun main() {

    //for loop

    //printing values 1 to 5
    for (a in 1..5){
        println(a)
    }

    ///printing single latter
    for(letter in 'A'..'Z'){
        println(letter)
    }

    //print next value like -> a -> b
    for (i in "Jnskjm "){
        print(i + 1)
    }

    //repeat function
    repeat(times = 5){
        println("Hey I am Android Developer!")
    }

    //printing values 10 to 1 reverse form
    for (b in 10 downTo 1){
        println(b)
    }

    //printing table like 2
    for (table in 2..20 step 2){
        println(table)
    }


}