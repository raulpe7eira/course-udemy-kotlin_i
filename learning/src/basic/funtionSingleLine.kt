package basic

fun hello2() = println("World")

fun toUpper2(str: String) = str.toUpperCase()

fun firstLetter2(str: String, index: Int) = str[index]

fun whichNumberIsBigger2(n1: Int, n2: Int) = if (n1 > n2) n1 else n2

fun main(args: Array<String>) {

    hello2()
    println(toUpper2("Raul"))
    println(firstLetter2("Raul", 3))
    println(whichNumberIsBigger2(1,2))

}
