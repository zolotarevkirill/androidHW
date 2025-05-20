package main

fun main() {
    val numbers = arrayOf(45, 12, 89, 34, 67, 23, 90, 1, 56)
    
    var evenCount = 0
    var oddCount = 0
    
    for (number in numbers) {
        if (number % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
    }
    
    println("Array: ${numbers.joinToString(", ")}")
    println("Even numbers: $evenCount")
    println("Odd numbers: $oddCount")
} 