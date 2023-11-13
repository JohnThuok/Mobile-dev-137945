//import com.sun.tools.javap.JavapTask.BadArgs

//import jdk.javadoc.internal.doclint.DocLint.BadArgs

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

/*fun main(args: Array<String>) {
    val ch = 'z'
    when(ch){
        'a','e','i','o','u' -> println("$ch is vowel")
        else -> println ("$ch is consonant")
    }
}*/

//LAB2 22/09/2023

//1. EXPLORE THE MAIN FUNCTION
/*fun main(args: Array<String>) {
    println("Hello, world!")
}*/


//2. LEARN WHY (ALMOST) EVERYTHING HAS A VALUE
/*fun main(args: Array<String>){
/*val isUnit = println("This is an expression")
println(isUnit)*/

    /*val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)*/

    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
}*/


// 3. LEARN MORE ABOUT FUNCTIONS
/*import java.util.*

fun main(args: Array<String>){
    feedTheFish()
}

fun fishFood (day : String) : String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println ("Today is $day and the fish eat $food")
}
fun randomDay() : String {
    val week = arrayOf ("Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday")
    return week[Random().nextInt(week.size)]
}*/


//STEP 2
/*import java.util.*

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}

fun main(args: Array<String>) {
    feedTheFish()
}*/



// 4. EXPLORE DEFAULT VALUES AND COMPACT FUNCTIONS
/*fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun main(args: Array<String>){
    swim()
    swim("slow")
    swim(speed = "turtle-like")

}*/

/*import java.util.*
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}


    fun feedTheFish(){
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
        println("Change water: ${shouldChangeWater(day)}")
    }
fun main(args: Array<String>){
    feedTheFish()

}*/



/*import java.util.*
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}


fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}
fun main(args: Array<String>){
    feedTheFish()

}*/









