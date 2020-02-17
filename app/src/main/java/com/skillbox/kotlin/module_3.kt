package com.skillbox.kotlin

import androidx.core.graphics.component1
import androidx.core.util.rangeTo
import java.security.Key

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

    tailrec fun recursedNOD(sum : Int, num : Int, smallestNumber : Int) : Int{
        if (sum % smallestNumber == 0 && num % smallestNumber == 0) {
            return smallestNumber
        }
        return recursedNOD(sum, num, smallestNumber - 1)



    }
    println("Поиск НОД с рекурсией:")
    numbers?.forEach { println("Наибольший общий делитель для $sum и $it - ${recursedNOD(sum, it, it)}")}

//*   10 задание   */
    val map = numbers.map { it to recursedNOD(sum, it, it)}.toMap()
    println("$map")

//*   11 задание   */
    map?.forEach { println("Число: ${it.key} Сумма: $sum НОД: ${it.value} ")}
}













