package main

fun main() {
    val numbers = arrayOf(10, 20, 30, 40, 50)
    
    if (numbers.size >= 2) {
        println("Second element: ${numbers[1]}")
    } else {
        println("Array has less than 2 elements")
    }
} 