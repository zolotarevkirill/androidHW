fun main() {
    println("Программа для определения оценки студента")
    println("----------------------------------------")
    
    print("Введите количество баллов (от 0 до 100): ")
    val points = readLine()?.toIntOrNull()
    
    if (points == null) {
        println("Ошибка: Введите корректное число баллов")
        return
    }
    
    if (points < 0 || points > 100) {
        println("Ошибка: Баллы должны быть от 0 до 100")
        return
    }
    
    val grade = when (points) {
        in 90..100 -> "A"
        in 75..89 -> "B"
        in 50..74 -> "C"
        in 30..49 -> "D"
        else -> "F"
    }
    
    println("\nРезультат:")
    println("Количество баллов: $points")
    println("Оценка: $grade")
    
    // Дополнительная информация о результатах
    when (grade) {
        "A" -> println("Отличный результат!")
        "B" -> println("Хороший результат")
        "C" -> println("Удовлетворительный результат")
        "D" -> println("Результат ниже среднего")
        "F" -> println("Неудовлетворительный результат")
    }
} 