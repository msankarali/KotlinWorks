package basictypes

fun main() {
    val studentNumbers = arrayOf(13, 15, 35, 25, 21)
    val studentNames = arrayOf("Ahmet", "Ayşe", "Veli", "Burcu")
    val firstCharOfName = arrayOf('A', 'A', 'C', 'B')
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'V', true)
    val arrayOfNulls = arrayOfNulls<String>(4)

    val carNamesMini = Array<String>(5) { "MiniCopper" }
    val carNames = Array<String>(10) {
        (it * it).toString()
    }

    val firstCharOfCountries = CharArray(4)
    firstCharOfCountries[0] = 'T'
    firstCharOfCountries.set(1, 'İ')
    firstCharOfCountries.set(3, 'A')

    firstCharOfCountries[2] = 'B'

    println("firstCharOfCountries index 2 : " + firstCharOfCountries.get((2)))
    println("firstCharOfCountries index 2 : " + firstCharOfCountries[3])


}