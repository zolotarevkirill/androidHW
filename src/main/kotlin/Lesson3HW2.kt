fun main() {
    println("Программа для проверки числа на простоту")
    println("----------------------------------------")
    
    print("Введите число: ")
    val number = readLine()?.toIntOrNull()
    
    if (number == null) {
        println("Ошибка: Введите корректное число")
        return
    }
    
    if (number <= 1) {
        println("Число $number не является простым")
        println("Простое число должно быть больше 1")
        return
    }
    
    var isPrime = true
    var divisor = 2
    
    // Проверяем все возможные делители до квадратного корня из числа
    while (divisor * divisor <= number) {
        if (number % divisor == 0) {
            isPrime = false
            break
        }
        divisor++
    }
    
    println("\nРезультат проверки:")
    println("Число: $number")
    if (isPrime) {
        println("Это число является простым")
    } else {
        println("Это число не является простым")
        println("Оно делится на $divisor")
    }
    
    // Дополнительная информация
    println("\nОбъяснение:")
    if (isPrime) {
        println("Простое число - это число, которое делится только на 1 и на само себя")
    } else {
        println("Составное число - это число, которое имеет делители кроме 1 и самого себя")
    }
} 