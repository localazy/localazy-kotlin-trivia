package com.localazy.trivia

private infix fun Unit.Android(body: Unit) = Unit
private infix fun Unit.with(body: Unit) = Unit
private infix fun String.of(input: String) = this.plus(input)
private fun Localazy(body: () -> String) = println(body())

private val translate = Unit
private val app = Unit
private const val free = "Of course, "
private const val charge = "sir!"

fun main() {
    translate Android app with Localazy {
        free of charge
    }
}