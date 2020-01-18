package basictypes

fun main() {
    val countryCode = readLine()!!
    when (countryCode.toLowerCase()) {
        "tr", "az" -> println("Turki Vatandasi")
        "ar" -> println("Arab Vatandasi")
        "fr" -> println("France Vatandasi")
        "ru" -> println("Russian Vatandasi")
        "uk" -> println("United Kingdom Vatandasi")
    }

    when {
        countryCode.toLowerCase() == "tr" || countryCode.toLowerCase() == "az" -> {
            println("TC Vatandasi")
        }
        countryCode.toLowerCase() == "ar" -> {
            println("Arab Vatandasi")
        }
        countryCode.toLowerCase() == "fr" -> {
            println("France Vatandasi")
        }
        countryCode.toLowerCase() == "ru" -> {
            println("Russian Vatandasi")
        }
        countryCode.toLowerCase() == "uk" -> {
            println("United Kingdom Vatandasi")
        }
    }

    when {
        countryCode.toLowerCase() == "tr" -> println("TC Vatandasi")
        countryCode.toLowerCase() == "ar" -> println("Arab Vatandasi")
        countryCode.toLowerCase() == "fr" -> println("France Vatandasi")
        countryCode.toLowerCase() == "ru" -> println("Russian Vatandasi")
        countryCode.toLowerCase() == "uk" -> println("United Kingdom Vatandasi")
    }

    if (countryCode.toLowerCase() == "tr")
        println("TC Vatandasi")
    else if (countryCode.toLowerCase() == "ar")
        println("Arab Vatandasi")
    else if (countryCode.toLowerCase() == "fr")
        println("France Vatandasi")
    else if (countryCode.toLowerCase() == "ru")
        println("Russian Vatandasi")
    else if (countryCode.toLowerCase() == "uk")
        println("United Kingdom Vatandasi")

    var countryCode2: String = if (countryCode.toLowerCase() == "tr") {
        println("wrong!!")
        "1"
    } else {
        println("else!")
        "-1"
    }

    countryCode2 = when (countryCode2.toLowerCase()) {
        "tr" -> {
            println("TR")
            "TR Selected"
        }
        else -> {
            println("Sth wrong!")
            "WRONG PLACE SELECTED"
        }
    }

    val phoneNumber: Long = 5419692951
    when (phoneNumber) {
        is Long -> {
            println("Long value")
        }
        !is Long -> {
            println(" Not a Long value")
        }
    }

    val number = 3
    when (number) {
        in 0..10 -> {
            println("0-...-10")
        }
        in 11..20 -> {
            println("11..20")
        }
        !in 11..20 -> {
            println("11..20")
        }
    }

}