package com.example.genericsobjectsextensions

enum class DifficultyData {
    EASY, MEDIUM, HARD
}

data class QuestionData<T>(
    val questionText: String,
    val answer: T,
    val difficulty: DifficultyData
)

fun main() {
    val question1 = QuestionData<String>("Quoth the raven ___", "nevermore", DifficultyData.MEDIUM)
    val question2 = QuestionData<Boolean>("The sky is green. True or false", false, DifficultyData.EASY)
    val question3 = QuestionData<Int>("How many days are there between full moons?", 28, DifficultyData.HARD)
    println(question1.toString())
    println(question2.toString())
    println(question3.toString())
}

//https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1#codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-generics