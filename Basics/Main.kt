fun main() {
    val simple = "hi"
    var name = 10
    println("Hello $simple $name")
    println(name.div(10))
    name = 20
    println(name)
    println("Max value for Int is: " + Int.MAX_VALUE)
    if (name < Int.MAX_VALUE) {
        println("You have entered a number greater than 10")
    } else {
        println("The value you entered is not more than 10")
    }

}
