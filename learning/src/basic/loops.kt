package basic

fun main(args: Array<String>) {

    for (x in 1..10) {
        println(x)
    }

    var index1 = 1
    while (index1 < 10) {
        println(index1)
        index1++
    }

    var index2 = 1
    do {
        println(index2)
    } while (0 >= index2++)

    val interval = 1..10
    for (x in interval step 2) {
        println(x)
    }

    for (x in 100 downTo 1 step 2) {
        println(x)
    }

}
