fun main() {
    println("Программа для проверки числа на палиндром")
    println("----------------------------------------")
    
    print("Введите число: ")
    val number = readLine()?.toIntOrNull()
    
    if (number == null) {
        println("Ошибка: Введите корректное число")
        return
    }
    
    if (number < 0) {
        println("Ошибка: Число должно быть положительным")
        return
    }
    
    // Преобразуем число в строку для удобства работы с цифрами
    val numberStr = number.toString()
    var isPalindrome = true
    
    // Используем цикл для сравнения цифр с начала и конца числа
    for (i in 0 until numberStr.length / 2) {
        if (numberStr[i] != numberStr[numberStr.length - 1 - i]) {
            isPalindrome = false
            break
        }
    }
    
    println("\nРезультат проверки:")
    println("Число: $number")
    if (isPalindrome) {
        println("Это число является палиндромом")
    } else {
        println("Это число не является палиндромом")
    }
    
    // Дополнительная информация
    println("\nОбъяснение:")
    if (isPalindrome) {
        println("Число читается одинаково слева направо и справа налево")
    } else {
        println("Число читается по-разному слева направо и справа налево")
    }
} 