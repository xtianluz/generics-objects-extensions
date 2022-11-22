package com.example.genericsobjectsextensions

enum class Difficulty {
    EASY, MEDIUM, HARD
}

class QuestionEnum<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)


val question1 = QuestionEnum<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
val question2 = QuestionEnum<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
val question3 = QuestionEnum<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

fun main(){

    println(question1.questionText)
    println(question2.answer)
    println(question3.difficulty)
}

//https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1#codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-generics