fun main() {
    // unlike in java, c++ here we can't declare the null value to the variable
    // like String name = NULL;
    // This is not the case here
    // But instead

    var name: String? = null
    // what if assign a value to it
    name = "Hello"
    println(name)
    // the result is it will print the newly assigned

    // If we are finding the length
    // we can't do it simple like this "name.length" if the value is null
    // what we do is
    var name2: String? = null

    println(name2?.length)
    // here we use a '?' (safe call operator) same as we did in to declare the nullable string


    // another condition arises what if we want to check the value is null or not
    // we can do it like
    if (name2 != null) {
        println(name2)
    } else {
        println("The value is null")
    }
    // there is also a shorter way to do this
    println(name2 ?: "The value is null")

    // This is how you raise a null pointer exception (assertion)
    println(name2!!.length)

    //There is a question We use non null-assertion(!!) or safe call operator(?)
    //I have a simple solution for that
    //Whenever you are using assertion you must assure that the value can 100% be null
    //If you have a doubt you better use safe call operator(?)

}
/*
You can think of assertion as the double not operator that specifies if the condition is really true or not.
Let's say I want to check something equal something,I'll use a == b. same case here If we want to check that the value
is null at some point we use !! ( assertion ).

*/