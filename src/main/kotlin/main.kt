fun main() {
    val isRegularCustomer = true
    val amount = 2500

    var discount = if (amount <= 1_000) 0 else if (amount<=10_000) 100 else (amount*0.05).toInt()
    discount += if (isRegularCustomer) ((amount - discount) * 0.01).toInt() else 0

    println("Стоимость покупок с учетом скидки составит ${amount - discount} руб")

}