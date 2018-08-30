package basic

fun main(args: Array<String>) {

    try {
        var number = "absadfa".toInt()
    } catch (e: NullPointerException) {
        println("Null!")
    } catch (e: NumberFormatException) {
        println("Não é um número!")
    } catch (e: Exception) {
        println("Não sei o que aconteceu!")
    } finally {
        println("Acabou!")
    }

}
