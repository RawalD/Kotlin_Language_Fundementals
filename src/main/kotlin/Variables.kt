fun main() {
    //Comment single line
    /*

    Comment multi line

     */

//Add a TO-DO, can be spotted at the bottom
    //TODO: Add more variable

//Declare Variables
    //Mutable variables

    //var keyword, variable name, variable type , value
    var name: String = "Dip"

    //var keyword, variable name, variable type, not yet initialised
    var age: Int?
    age = 27

    //Double type
    var valueOfPi:Double = 3.142

    //Float type. F added as identifier
    var heightInMeters:Float = 1.72F

    //Let Kotlin figure out the data type. Simply leave out the data type
    var myLastName = "Rawal"

    //Immutable variable , use val keyword
    val nationality = "South Africa"

// Hello World First Of Course
    //String formatting achieved with $ , for accessing values like from an array then use ${arrayname[index]}
    println("Hello World, my first name is $name whilst my last name is $myLastName,I am $age years old. I know the value of PI is $valueOfPi so I'm smart. My height is $heightInMeters and I'm from sunny" +
            "$nationality ")

    //Variable Data Types
    //Numbers
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 15
    val myLong: Long = 1_000_000_000

    //Boolean
    var isHot:Boolean = true
    var isCold:Boolean = false

   //Char
    val letterChar = 'A'
    val digitChar = '1'

    //String
    val myStr = "Hello Kotlin"
    //Grab char from string
    val firstCharInMyStr = myStr[0]
    //Grab last char
    val lastCharInMyStr = myStr[myStr.length - 1]

}