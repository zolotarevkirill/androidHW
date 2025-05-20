package main

fun main() {
    val rows = 2
    val cols = 3
    val matrix = Array(rows) { Array(cols) { 0 } }
    
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("Enter element at position [$i][$j]: ")
            matrix[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }
    
    var sum = 0
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            sum += matrix[i][j]
        }
    }
    
    println("\nMatrix:")
    for (i in 0 until rows) {
        println(matrix[i].joinToString(" "))
    }
    println("Sum of all elements: $sum")
} 