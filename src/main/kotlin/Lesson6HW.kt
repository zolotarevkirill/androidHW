package main

fun main() {
    val numbers = arrayOf(45, 12, 89, 34, 67, 23, 90, 1, 56)
    
    var min = numbers[0]
    var max = numbers[0]
    var minIndex = 0
    var maxIndex = 0
    
    for (i in numbers.indices) {
        if (numbers[i] < min) {
            min = numbers[i]
            minIndex = i
        }
        if (numbers[i] > max) {
            max = numbers[i]
            maxIndex = i
        }
    }
    
    println("Array: ${numbers.joinToString(", ")}")
    println("Minimum value: $min at index $minIndex")
    println("Maximum value: $max at index $maxIndex")
} 