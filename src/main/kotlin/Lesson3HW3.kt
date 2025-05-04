fun main() {
    println("Программа для нахождения цифрового корня числа")
    println("---------------------------------------------")
    
    print("Введите положительное число: ")
    val input = readLine()?.toIntOrNull()
    
    if (input == null) {
        println("Ошибка: Введите корректное число")
        return
    }
    
    if (input < 0) {
        println("Ошибка: Число должно быть положительным")
        return
    }
    
    fun calculateDigitalRoot(n: Int): Int {
        var currentNumber = n
        var steps = 0
        
        println("\nПроцесс вычисления:")
        
        // Продолжаем суммировать цифры, пока не получим однозначное число
        while (currentNumber > 9) {
            steps++
            val digits = currentNumber.toString().map { it.toString().toInt() }
            val sum = digits.sum()
            
            // Выводим текущий шаг
            println("Шаг $steps: ${digits.joinToString(" + ")} = $sum")
            
            currentNumber = sum
        }
        
        println("\nРезультат:")
        println("Исходное число: $n")
        println("Цифровой корень: $currentNumber")
        println("Количество шагов: $steps")
        
        return currentNumber
    }
    
    calculateDigitalRoot(input)
    
    // Дополнительная информация
    println("\nОбъяснение:")
    println("Цифровой корень - это однозначное число, полученное путем")
    println("последовательного суммирования цифр исходного числа")
} 