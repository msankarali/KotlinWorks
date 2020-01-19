package basictypes

fun main() {
    val numbers = 1..100
    val alphabeth = 'A'..'Z'
    for (char in alphabeth) {
        print(char)
    }
    println()

    val numbers2 = 1.rangeTo(100)
    numbers2.forEach { print(" " + it) }
    println()

    // val reversedNumbers = 100..1 // downTo?
    val reverseNumbers = 100.downTo(1)
    val reverseNumbers2 = 100 downTo 1
    repeat(reverseNumbers2.count()) { print(" " + it) }
    println()
    reverseNumbers.forEach { print(" " + it) }
    println()

    val gradeNumbers = 10.until(100) // [10..100) Dahil degil
    val gradeNumbers2 = 10 until 100
    repeat(gradeNumbers.count()) { print(" " + it) }
    println()

    val stepedNumbers = 1..100 step 2
    val stepedNumbers2 = 1..100 step (2)
    repeat(stepedNumbers.count()) { print(" " + it) }
    println()

    val numberList: IntRange = 10..100
    numberList.first
    numberList.last
    numberList.step


    when (10) {
        in numberList -> {
            println("10 sayisi")
        }
    }

    val countBiggerThan50 = numberList.count {
        it > 50
    } //süslü parantez kullanımı ile parantez kullanımı farklı

    println(countBiggerThan50)

}