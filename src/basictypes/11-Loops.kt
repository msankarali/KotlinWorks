package basictypes

fun main() {
    for (value in 1..10) {
        println(value)
    }

    val countryCodeArray = arrayOf("tr", "az", "en", "fr")

    for (value in countryCodeArray) {
        print("$value ")
    }

    for (index in countryCodeArray.indices) { //index numbers
        print("${index + 1}. value is: ${countryCodeArray[index]}\n")
    }

    for ((index, value) in countryCodeArray.withIndex()) { //index numbers
        print("${index + 1}. value is: $value\n")
        if (index == 3333) return
    }

    repeat(5) {
        print("Daha cok blog yazmam lazim!\n")
    }

    for (value in 1..50) {
        if (value % 2 == 1) {
            continue
        }
        print("\n$value")
    }

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) { //twitter
            if (value2 == 5) {
                continue@returnLabel
            }
        }
    }
}