package basictypes

fun main() {
    val name: String? = null // null atamasi icin ? kullanilmali
    val age: Int? = null
    var number1: Int? = null
    var number2: Int? = null

    var result: Int? = 0

    /*number1 = readLine()!!.toInt()
    number2 = readLine()!!.toInt()

    number1 = null
    result = number1!! + number2!!*/

    println(result)

    if (number1 != null && number2 != null) {
        result = number1 + number2
    }

    var longNumber1: Long? = number1?.toLong() // null, kontrolu iyi yapilmali
    if (number1 == null) {
        print("longNumber1 is null")
    } else {
        longNumber1 = number1.toLong()
    }

    /*
    calisirken !! kulannin ama canliya alirken ?. islemi olmali
    myVariable?.toString() Bu şu anlama mı geliyor myVariable null ise toString işlemini yapmıyor doğru mudur?
     */
    //println("Number1 ${number1!! + number2!!}")

    //println("valByte is " + number1.javaClass.name)
}

// Kotlin'de global type yoktur.