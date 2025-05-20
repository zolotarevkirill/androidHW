package main

fun main() {
    val numbers = arrayOf(4, 2, 2, 8, 5, 1, 2, 4, 1, 8, 8)
    
    println("Original array: ${numbers.joinToString(", ")}")
    
    // Count frequency of each number
    val frequencyMap = numbers.groupingBy { it }.eachCount()
    
    // Sort by frequency (descending) and then by value (ascending)
    val sortedArray = numbers.sortedWith(
        compareByDescending<Int> { frequencyMap[it] }
            .thenBy { it }
    ).toTypedArray()
    
    println("Sorted by frequency: ${sortedArray.joinToString(", ")}")
    
    // Print frequency of each number
    println("\nFrequency of each number:")
    frequencyMap.entries.sortedByDescending { it.value }
        .forEach { (number, frequency) ->
            println("$number appears $frequency times")
        }
} 