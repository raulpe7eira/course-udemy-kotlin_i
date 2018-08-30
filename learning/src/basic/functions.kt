package basic

fun hello() {
    println("World")
}

fun toUpper(str: String): String {
    return str.toUpperCase()
}

fun firstLetter(str: String, index: Int): Char {
    return str[index]
}

fun whichNumberIsBigger(n1: Int, n2: Int): Int {
    return if (n1 > n2) n1 else n2
}

fun main(args: Array<String>) {

    hello()
    println(toUpper("Raul"))
    println(firstLetter("Raul", 3))
    println(whichNumberIsBigger(1,2))

}
