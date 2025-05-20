package main

fun main() {
    val numbers = arrayOf(45, 12, 89, 34, 67, 23, 90, 1, 56)
    
    println("Original array: ${numbers.joinToString(", ")}")
    
    // Reverse the array
    for (i in 0 until numbers.size / 2) {
        val temp = numbers[i]
        numbers[i] = numbers[numbers.size - 1 - i]
        numbers[numbers.size - 1 - i] = temp
    }
    
    println("Reversed array: ${numbers.joinToString(", ")}")
} 