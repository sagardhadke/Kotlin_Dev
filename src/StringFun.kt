fun main() {


    //String Manipulation?

    /* The method of extracting date form String, modifying them, or
    * combining different strings is called manipulation of strings. */

    //String Functions?

    /* String functions are built-in functionalities used in kotlin to
    * perform various operations on strings or manipulate them. */


    //Uses of String Functions in Kotlin

    /* Built-in functionalities in Kotlin.
    * Perform various operations on strings.
    * Manipulate,search,modify,and extract
    * information from strings. */


    val name = "Sagar Dhadke"
    val getLength = name.length
    println("The length of the String is $getLength")

    val charIndex = name.get(4)
    println("The character of index 4 is $charIndex")

    val subString = name.substring(2,7)
    println("Substring of index 2 to 7 is $subString")

    val upperCase = name.uppercase()
    val lowerCase = name.lowercase()
    println("Uppercase String is $upperCase and Lowercase String is $lowerCase")

    val withSpace = "   Hey I am an Senior Android Dev "
    val trimmed = withSpace.trim()
    println("Trimmed string is $trimmed")


    val contain = name.contains("Sagar")
    println("Does the contains Sagar? $contain")

    val replace = name.replace('a','A')
    println("New string after replacing the character is $replace")
}