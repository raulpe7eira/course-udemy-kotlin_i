package basic

import java.util.*

fun myPackage1() {
    println("Olá 1")
}

fun myPackage2() {
    println("Olá 2")
}

fun main(args: Array<String>) {

    val calendar: Calendar = Calendar.getInstance()
    println(calendar.get(Calendar.YEAR))

}
