package exercises

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
    var phrase = StringBuilder()
    var i = str.length - 1
    while (i >= 0) {
        phrase.append(str[i])
        i--
    }
    return phrase.toString()
}
