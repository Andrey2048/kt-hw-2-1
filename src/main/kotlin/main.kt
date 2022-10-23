fun main() {
    for (i in 1..20) {
        var amount = i * 1_000
        println(
            "Сумма  $amount руб." +
                    " Комиссия " +
                    comission(amount) + " руб."
        )
    }
}


//расчет комиссии при переводе, amount - сумма в рублях; комиссию округляем до рублей
fun comission(amount: Int): Int {
    val ratePercent = 0.75 //стандартная ставка в процентах
    val minComission = 35 //минимальная комиссия в рублях
    return kotlin.math.max(minComission, (amount * (ratePercent / 100)).toInt())
}