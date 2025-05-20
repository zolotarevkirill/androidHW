package main

fun main() {
    val numbers = arrayOf(5, -3, 8, -1, 2, -7, 4, -2, 6)
    
    println("Original array: ${numbers.joinToString(", ")}")
    
    // Separate negative and positive numbers
    val negativeNumbers = numbers.filter { it < 0 }.toTypedArray()
    val positiveNumbers = numbers.filter { it >= 0 }.toTypedArray()
    
    // Combine arrays
    val result = negativeNumbers + positiveNumbers
    
    println("Sorted array: ${result.joinToString(", ")}")
} 