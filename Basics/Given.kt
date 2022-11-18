fun main() {
    val a = 10
    var text = when (a) {
        //for defining a range
        in 1..10 -> 20f
        10 -> "Hello"
        20 -> "SUP"
        else -> "ION"
    }
    println(text)
}
// when is same as switch case (like in java)