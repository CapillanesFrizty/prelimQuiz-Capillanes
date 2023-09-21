package com.example.prelimquiz_capillanes

class SumofEvenNumbers{
    fun main(){
        print(sumofEvenNumbers(4))
    }

    private fun sumofEvenNumbers(i: Int): Int {
        var sum = 0
        for( i in 2..i step 2){
            sum += i
        }
        return sum
    }
}