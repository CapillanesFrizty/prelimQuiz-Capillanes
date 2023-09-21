package com.example.prelimquiz_capillanes

class BMI {

    fun main(){
        println(calculateBMI(40.5,67.7))
    }

    private fun calculateBMI(weightKg: Double, height: Double): Any {
        if (weightKg <= 0.0 || height <= 0.0){
            throw IllegalArgumentException("Weight and Height must be positive values.")
        }
        val bmi = weightKg / (height * height)
        return bmi
    }
}