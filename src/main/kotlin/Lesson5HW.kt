package main

fun main() {
    val numbers = Array(5) { 0 }
    
    for (i in numbers.indices) {
        print("Enter number ${i + 1}: ")
        numbers[i] = readLine()?.toIntOrNull() ?: 0
    }
    
    val sum = numbers.sum()
    
    println("\nNumbers: ${numbers.joinToString(", ")}")
    println("Sum: $sum")
}

// Задание 1: Класс Student
class Student(
    private val name: String,
    private val age: Int,
    private val grade: Double
) {
    fun displayInfo() {
        println("Студент: $name")
        println("Возраст: $age")
        println("Средний балл: $grade")
    }
}
