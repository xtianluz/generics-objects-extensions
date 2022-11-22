package com.example.genericsobjectsextensions

import com.example.genericsobjectsextensions.Quiz.StudentProgress.answered
import com.example.genericsobjectsextensions.Quiz.StudentProgress.total


enum class DifficultySingleton {
    EASY, MEDIUM, HARD
}

data class QuestionSingleton<T>(
    val questionText: String,
    val answer: T,
    val difficulty: DifficultySingleton
)

class Quiz {
    val question1 = QuestionSingleton<String>("Quoth the raven ___", "nevermore", DifficultySingleton.MEDIUM)
    val question2 = QuestionSingleton<Boolean>("The sky is green. True or false", false, DifficultySingleton.EASY)
    val question3 = QuestionSingleton<Int>("How many days are there between full moons?", 28, DifficultySingleton.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

fun main() {
    println("${Quiz.answered} of ${Quiz.total} answered.")
}