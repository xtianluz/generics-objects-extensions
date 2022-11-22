package com.example.genericsobjectsextensions

enum class DifficultyExtended {
    EASY, MEDIUM, HARD
}

data class QuestionExtended<T>(
    val questionText: String,
    val answer: T,
    val difficulty: DifficultyExtended
)

class QuizExtended {
    val question1 = QuestionExtended<String>("Quoth the raven ___", "nevermore", DifficultyExtended.MEDIUM)
    val question2 = QuestionExtended<Boolean>("The sky is green. True or false", false, DifficultyExtended.EASY)
    val question3 = QuestionExtended<Int>("How many days are there between full moons?", 28, DifficultyExtended.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
//Start from this line below is lesson for Scope functions using let() and apply()
//Start from this line below is lesson for Scope functions let() and apply()
//Start from this line below is lesson for Scope functions let() and apply()

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

val QuizExtended.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"

fun QuizExtended.StudentProgress.printProgressBar() {
    repeat(QuizExtended.answered) { print("▓") }
    repeat(QuizExtended.total - QuizExtended.answered) { print("▒") }
    println()
    println(QuizExtended.progressText)

}

fun main() {
    println(QuizExtended.progressText)
    QuizExtended.printProgressBar()
    QuizExtended().apply {
        printQuiz()
    }
}

//https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1#codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-generics