import com.rsk.Person

fun main(args: Array<String>) {
    println("Hello World!")

    val kevin = Person("Kevin")

    println("Name is ${kevin.Name}")

    kevin.display()

    kevin.displayWithLamda(::printName)
}

fun printName(name: String) {
    println(name)
}