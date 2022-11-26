import java.util.*

fun main(args: Array<String>) {
    val text = "With    multiple \t whitespace"
    println(text.replaceMultipleWhiteSpace())
}

/**
 * Replaces multiple white spaces with one.
 */
fun String.replaceMultipleWhiteSpace() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

fun infixFunctions() {

}

fun ranges() {
    // Range variable type between 1 and 10
    var numbers = listOf(1,2,3,4,5)
    for(i in numbers) {
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for ((name, age) in ages) {
        println("$name is $age")
    }

    var range = 'a'..'z'
    for ((index, element) in range.withIndex()) {
        println("$element is at index $index")
    }
}

fun useQuestion() {
    println("Hello, World")
    val q = Question()

    q.Answer = "42"

    println("The Ansswer to the question ${q.Question} is ${q.Answer}")

    q.printResult()

    // Attempt to parse the answer as an Int
    val number:Int? = try {
        Integer.parseInt(q.Answer)
    } catch (e:NumberFormatException) {
        null
    }

    println("Number is $number")
}

class Question {
    //
    var Answer:String? = null
    val CorrectAnswer = "42"
    val Question:String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }

    fun printResult(){
        when (Answer) {
            CorrectAnswer -> {
                println("You were correct")
            }
            else -> {
                println("Try again?")
            }
        }
    }
}