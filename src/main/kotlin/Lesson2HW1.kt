fun main() {
    println("Программа для вычисления периметра и площади прямоугольника")
    println("--------------------------------------------------------")
    
    print("Введите длину прямоугольника: ")
    val length = readLine()?.toDoubleOrNull()
    
    if (length == null) {
        println("Ошибка: Введите корректное число для длины")
        return
    }
    
    print("Введите ширину прямоугольника: ")
    val width = readLine()?.toDoubleOrNull()
    
    if (width == null) {
        println("Ошибка: Введите корректное число для ширины")
        return
    }
    
    val perimeter = 2 * (length + width)
    val area = length * width
    
    println("\nРезультаты вычислений:")
    println("Периметр прямоугольника: $perimeter")
    println("Площадь прямоугольника: $area")
} 