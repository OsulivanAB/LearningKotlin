package rsk

class Course(val Id: Int, val Title: String) {

}

object Courses {
    var allCourses = arrayListOf<Course>()

    fun initialize() {
        allCourses.add(Course(1, "Kotlin Fundamentals"))
    }
}