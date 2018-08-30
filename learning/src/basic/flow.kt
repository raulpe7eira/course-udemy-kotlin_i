package basic

import java.util.*

//fun whatHapenned(year: Int): String {
//    if (year == 2018) {
//        return "Ano que aprendi Kotlin!"
//    } else if (year in 2019..2020)
//        return "Não sei do futuro!"
//    else
//        return "Não sei"
//}

//fun whatHapenned(year: Int) =  when (year) {
//    2018 -> "Ano que aprendi Kotlin!"
//    2019, 2020, 2021 -> "Não sei do futuro"
//    else -> "Não sei"
//}

fun whatHapenned(year: Int) =  when {
    year == 2018 -> "Ano que aprendi Kotlin!"
    year in 2019..2021 -> "Não sei do futuro"
    else -> "Não sei"
}

fun main(args: Array<String>) {

    val calendar: Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)

    println(whatHapenned(year))
}
