/*fun main(args: Array<String>) {
print ("Enter a number: ")

    val stringInput = readln()!!

    var integer:Int = stringInput.toInt()

    println("You entered: $integer")
}*/

/*fun main(args: Array<String>) {
    val first: Int = 10
    val second: Int = 20

    val sum = first + second

    println("the sum is: $sum")

}*/

/*fun main(args: Array<String>) {
    val ch = 'i'

    val vowelConstant = if (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )"vowel" else "constant"

    println("$ch is $vowelConstant")
}*/

fun main(args: Array<String>) {
    val ch = 'z'
    when(ch){
        'a','e','i','o','u' -> println("$ch is vowel")
        else -> println ("$ch is consonant")
    }
}