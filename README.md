# prelimQuiz-Capillanes

fun main() {
    println(SumofEvenNumbers(4))
}

fun SumofEvenNumbers(n: Int): Int {
    var sum = 0
    for (i in 2..n step 2) {
        sum += i
    }
    return sum
}
