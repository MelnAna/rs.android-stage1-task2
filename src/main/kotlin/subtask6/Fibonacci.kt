package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        var number2 = 1
        var number1 = 1
        var number: Int
        for (i in 3..n) {
            if (number2 * number1 == n) {
                return intArrayOf(number2, number1, 1)
            } else if (number2 * number1 > n) {
                break
            }
            number = number1 + number2
            number2 = number1
            number1 = number
        }
        return intArrayOf(number2, number1, 0)
    }
}
