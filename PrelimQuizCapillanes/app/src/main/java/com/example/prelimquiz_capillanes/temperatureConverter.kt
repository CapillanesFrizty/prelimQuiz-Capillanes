package com.example.prelimquiz_capillanes

class temperatureConverter {

    fun main() {
        val temperatureFahrenheit = 32.0
        val convertedTemperatureCelsius = convertTemperature(temperatureFahrenheit, "F", "C")
        println("$temperatureFahrenheit°F is equal to $convertedTemperatureCelsius°C")

        val temperatureKelvin = 273.15
        val convertedTemperatureFahrenheit = convertTemperature(temperatureKelvin, "K", "F")
        println("$temperatureKelvin K is equal to $convertedTemperatureFahrenheit°F")
    }

    fun convertTemperature(temperature: Double, fromUnit: String, toUnit: String): Double {
        if (temperature < -273.15) {
            throw IllegalArgumentException("Temperature cannot be below absolute zero.")
        }

        return when {
            fromUnit.equals("F", ignoreCase = true) && toUnit.equals("C", ignoreCase = true) -> {
                (temperature - 32) * 5/9
            }
            fromUnit.equals("F", ignoreCase = true) && toUnit.equals("K", ignoreCase = true) -> {
                (temperature + 459.67) * 5/9
            }
            fromUnit.equals("C", ignoreCase = true) && toUnit.equals("F", ignoreCase = true) -> {
                (temperature * 9/5) + 32
            }
            fromUnit.equals("C", ignoreCase = true) && toUnit.equals("K", ignoreCase = true) -> {
                temperature + 273.15
            }
            fromUnit.equals("K", ignoreCase = true) && toUnit.equals("F", ignoreCase = true) -> {
                (temperature * 9/5) - 459.67
            }
            fromUnit.equals("K", ignoreCase = true) && toUnit.equals("C", ignoreCase = true) -> {
                temperature - 273.15
            }
            fromUnit.equals(toUnit, ignoreCase = true) -> temperature // If the units are the same, no conversion needed
            else -> throw IllegalArgumentException("Invalid units for temperature conversion.")
        }
    }
}