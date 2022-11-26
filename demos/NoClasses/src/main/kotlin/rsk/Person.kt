package rsk

fun main(args: Array<String>) {
    val kevin = Student("Kevin", "Jones", 1, "Some Tutor")
    println(kevin.id)
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress():String
}

class Student(firstName: String, lastName: String, val id: Int) : Person(firstName, lastName) {

    constructor(firstName: String, lastName: String, id: Int, var tutor: String) : this(firstName, lastName, id) { }

    override fun getAddress(): String {
        TODO("Not yet implemented")
    }

    override fun getName() : String {return "$lastName, $firstName"}
}