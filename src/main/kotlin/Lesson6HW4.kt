package main

fun main() {
    // Test arrays
    val palindromeArray = arrayOf(1, 2, 3, 4, 3, 2, 1)
    val nonPalindromeArray = arrayOf(1, 2, 3, 4, 5, 6, 7)
    
    println("Array 1: ${palindromeArray.joinToString(", ")}")
    println("Is palindrome: ${isPalindrome(palindromeArray)}")
    
    println("\nArray 2: ${nonPalindromeArray.joinToString(", ")}")
    println("Is palindrome: ${isPalindrome(nonPalindromeArray)}")
}

fun isPalindrome(array: Array<Int>): Boolean {
    for (i in 0 until array.size / 2) {
        if (array[i] != array[array.size - 1 - i]) {
            return false
        }
    }
    return true
} 