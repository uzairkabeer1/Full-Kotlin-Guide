fun main() {

    println("Enter your name: ")
    val name = readLine()!!
    val cond = displayGreeting(name)
    println(message = cond)
    val values = displayGreet("Umair")
    println(values)
    var sum = addition(10, 20, 30, 40)
    println("The sum of numbers are: $sum")
}

//simple function
fun displayGreeting(name: String): Boolean {
    println("Hi, $name how are you going?")
    return true
} /* the parameters are declared explicitly by "val" means they're immutable even in the func */

//single expression functions
fun displayGreet(name: String): String = "Hi, $name how are you going"

//using vararg as a function parameter
fun addition(vararg number: Int): Int {
    var result: Int = 0
    for (num in number) {
        result += num
    }
    return result
}// vararg basically works like an arrayList

