@file:JvmName("DisplayFunctions")

fun display(message: String) : Boolean {
    println(message)
    return true
}

@JvmOverloads   // This allows default values to work because it overloads the function when it creates java versions
fun log(message: String, loglevel: Int = 1) {
    println(message)
}