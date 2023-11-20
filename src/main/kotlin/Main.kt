fun main(args: Array<String>) {
    val bikeCost = 17000
    val account = 2500
    val monthlyIncome = 1900
    val interestRate = 3

    val monthlyInterest = (100 + interestRate) / 100
    val monthlyAccumulation = (account + monthlyIncome) * monthlyInterest
    val accumulationTime = bikeCost / monthlyAccumulation

    // Вывод
    println("Время накопления на велосипед: $accumulationTime месяцев")
}