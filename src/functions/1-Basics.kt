package functions

fun main() {
    print("Sayi1 giriniz: ")
    val numberOne = readLine()!!.toInt()
    print("Sayi2 giriniz: ")
    val numberTwo = readLine()!!.toInt()
    print("Matematiksel operatoru giriniz: ")

    val result = when (readLine()!!) {
        "+" -> {
            numberOne + numberTwo
        }
        "-" -> {
            numberOne - numberTwo
        }
        "/" -> {
            numberOne / numberTwo
        }
        "*" -> {
            numberOne * numberTwo
        }
        else -> {
            0
        }
    }

    val numberThree = getValue("Sayi3'u giriniz: ")
    val numberFour = getValue("Sayi4'u giriniz: ")
    println("Result: " + calculate(numberThree, numberFour))

    val numberFive = getValue()

    val deneme = Deneme()
    deneme.print()
    reformatMessage("Message", true, 7, "tr")
    reformatMessage("Message", size = 7, lang = "tr")
    reformatMessage("Message", true, 7)
    reformatMessage(size = 7, message = "Message")

    getUserInfo("Servet", "ANKARALI", "Konya", "Turkey", "232", "many of us!", key = 2)
    getUserInfo(*arrayOf("Servet", "ANKARALI", "Konya", "Turkey"), key = 2)
    getUserInfo2("2", 3, true, null, 'c', "mahmut", key = 2) // Key is a must have

}

fun getValue(printMessage: String = ""): Int { //default argument
    print(printMessage)
    val value = readLine()!!.toInt()
    print("----------------------------------------\n")
    return value
}

/*fun getValue(printMessage: String): Int {
    print(printMessage)
    val value = readLine()!!.toInt()
    print("----------------------------------------\n")
    return value
}*/

fun calculate(numberOne: Int, numberTwo: Int): Double {
    val result = when (readLine()!!) {
        "+" -> numberOne + numberTwo
        "-" -> numberOne - numberTwo
        "/" -> numberOne / numberTwo
        "*" -> numberOne * numberTwo
        else -> 0
    }
    return result.toDouble()
}

fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {
    ///default argument
}

class Deneme {
    @JvmOverloads
    fun print(message: String = "Message") {

    }

}

// name: String, surName: String, city: String, country: String
fun getUserInfo(vararg userInfo: String, key: Int) {
    userInfo[4]
}

fun getUserInfo2(vararg userInfo: Any?, key: Int) {
    userInfo[4]
}

/*fun getUserInfo2(vararg userInfo: String, vararg userInfo2: String){
    //İki varargs kullanılamaz
}*/

// generics
// any farklari
// primary secondary
// implementation
