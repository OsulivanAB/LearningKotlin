package rsk

fun main(args: Array<String>) {
    val kevin = Student("Kevin", "Jones", 1, "Some Tutor")
    println(kevin.id)

    Student.createPostgrad("Simon")
}

// Creating a static main method similar to how a java file would work.
class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val kevin = Student("Kevin", "Jones", 1, "Some Tutor")
            println(kevin.id)

            Student.createPostgrad("Simon")
        }
    }
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress():String
}

open class Student(firstName: String, lastName: String, _id: Int, var tutor: String = "") : Person(firstName, lastName) {
    val id : Int

    init {
        id = _id
    }

    fun enrole(courseName : String) {
        val course = Courses.allCourses
            .filter { it.Title == courseName }
            .firstOrNull()
    }

    override fun getAddress(): String {
        TODO("Not yet implemented")
    }

    override fun getName() : String {return "$lastName, $firstName"}

    // Factory methods that can be used without creating an instance of a class.
    // These are like static methods
    companion object : XmlSerializer<Student> {
        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }

        fun createUndergrad(name: String): Undergraduate {
            return Undergraduate(name)
        }
        fun createPostgrad(name: String): Postgraduate {
            return Postgraduate(name)
        }
    }
}

class Undergraduate(firstName:String) : Student(firstName, "", 1) {

}

class Postgraduate(firstName:String) : Student(firstName, "", 1) {

}

interface XmlSerializer<T> {
    fun toXml(item: T)
}