package basic

fun main(args: Array<String>) {

    val name = "Raul" +
            " Pereira"
    println(name)

    val name2 = """
        Raul
        Pereira
    """.trimIndent()
    println(name2)

    val name3 = "Raul"
    println("Olá, $name3")
    println("Olá, ${name3.length}")
    println("Olá, ${name3[0]}")

}
