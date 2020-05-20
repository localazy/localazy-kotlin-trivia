package com.localazy.trivia

private infix fun Unit.`❤️`(text: String) = println(text)
private val Localazy = Unit
private val Kotlin = "Thank you, JetBrains!"

// Add 3 lines of code outside the main function
// to make it print: Thank you, JetBrains!
fun main() {
    Localazy `❤️` Kotlin
}