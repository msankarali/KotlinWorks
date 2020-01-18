package basictypes

import java.io.IOException

fun main() {
    print("Ogrenci misin?: ")
    val answer = readLine()

    val result = if (answer == "Evet") {
        println("Öğrenci")
    } else {
        println("Öğrenci değil")
    }

    val result2: Boolean = if (answer == "Evet") {
        println("A student")
        true
    } else {
        println("Not a student")
        false
    }

    println(result2)


    val isStudent = false
    if (isStudent === true) print('1') else print('2')
    val name = if (isStudent) "Student" else "Not a student"


    val grade = readLine()!!.toDouble()
    if (grade > 100 || grade < 0) {
        println("Wrong entry!")
    } else if (grade > 84) {
        println("AA")
    } else if (grade > 69) {
        println("BB")
    } else if (grade > 54) {
        println("CC")
    } else if (grade > 39) {
        println("DD")
    } else {
        println("FF")
    }


    if (10 == 10L.toInt()) {
        println(true)
    }

    if (10.toLong() == 10L)
        println(true)
    // expression vs statement
    val number = if (10.toLong() == 10L) {
        println("true")
        43
    } else {
        -1
    }

    if (grade <= 100) {

    }

    if (grade >= 85) {

    }

    if (grade <= 84) {

    }

    if (isStudent) {
        println("Student")
    } else {
        otherMethod()
    }

    if (isStudent) {
        println("Student")
        throw IOException()
        return
    }
}

private fun otherMethod() {
    // ternary operator
}


/**100-85 aa
 * 84-70 bb
 * 69-55 cc
 * 54-40 dd
 * 39-0 ff
 */
// val studentGrade: Int = readLine()!!.toInt()
