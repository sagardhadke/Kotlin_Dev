fun main() {
    //String Template in Kotlin
    val num = 20
    //converting Value to float
    val favoriteNum = "My Favorite Number is ${num.toFloat()}"
    println(favoriteNum)

    setAge(19)

    //tripple-quited String

    val about = """Hey My name is Sagar Dhadke
        |I am an android app developer 
        |Currently Learning Jetpack compose
        |I am college dropout student
        |Currently Working as Software Enginner at India's Most Popular NoBroker Company.
        |Thanks Have a Grate Day :)
    """.trimMargin()
    println(about)

}

fun setAge(age : Int){
    println("${if (age < 18) "Minor" else "Adult"}")
}