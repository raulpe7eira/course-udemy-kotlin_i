package exercises

fun countVowels(phrase: String): Int {
    val VOWELS = "aeiou"
    return phrase.filter { it.toLowerCase() in VOWELS }.length
}

fun countConsonants(phrase: String): Int {
    val CONSONANTS = "bcdfghjklmnpqrstvwxyz"
    return phrase.filter { it.toLowerCase() in CONSONANTS }.length
}
