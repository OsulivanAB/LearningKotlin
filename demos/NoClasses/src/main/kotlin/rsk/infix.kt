@file:JvmName("infix")
package rsk

fun main(args: Array<String>) {
    val h1 = Header("H1")
    val h2 = Header("H2")

    val h3 = h1.plus(h2)
    println("h3 uses .plus() and the value is ${h3.Name}")

    val h4 = h1 plus h2
    println("h4 uses plus and the value is ${h4.Name}")

    val h5 = h1 + h2
    println(h4.Name)
}

class Header(var Name: String) {}

operator infix fun Header.plus(other: Header) : Header {
    return Header(this.Name + other.Name)
}