package com.example.prelimquiz_capillanes

class CurrencyExchange {

    fun main() {
        val amountInUSD = 100.0
        val exchangeRateUSDToEUR = 0.85 // 1 USD to EUR

        val amountInEUR = convertCurrency(amountInUSD, "USD", "EUR", exchangeRateUSDToEUR)

        println("$amountInUSD USD is equal to $amountInEUR EUR")
    }

    fun convertCurrency(amount: Double, fromCurrency: String, toCurrency: String, exchangeRate: Double): Double {
        if (amount < 0) {
            throw IllegalArgumentException("Amount cannot be negative.")
        }

        if (exchangeRate <= 0) {
            throw IllegalArgumentException("Exchange rate must be greater than zero.")
        }

        return amount * exchangeRate
    }

}