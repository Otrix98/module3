package com.skillbox.kotlin

fun main () {

    print("Введите число: ")
    val n = readLine()?.toIntOrNull() ?:return
    print("введите $n чисел последовательно: ")
    var currentNumber = 0
    val numbers : MutableList<Int> = mutableListOf()
    while (currentNumber < n) {
        val m = readLine()?.toIntOrNull() ?:continue
        numbers.add(m)
        currentNumber++
    }
    println( "Вы ввели числа:$numbers" )

    val positiv = numbers.count {it>0}
    println( "Положительных чисел: $positiv" )

    val adjectiv = numbers.filter { it % 2 == 0 }
    println( "Из них чётные: $adjectiv" )

    val unic = numbers.toSet()
    val unicCount = unic.count()
    println( "Не повторяющихся: $unicCount" )

    val sum = numbers.sum()
    println( "Сумма всех чисел: $sum")

     fun nod (unic: Int , sum: Int ) {
        return if ( unic == 0 )
            sum
        } else  {
        nod(sum % unic, )
    }
}


