package functions

fun main() {
    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 1341
    println(schoolNumber)

    val tcIdentityNumber: Long = 1856465465414
    println(tcIdentityNumber)

    log2(pi)
    log2(schoolNumber)
    log2(tcIdentityNumber)

    (3 + 0.14).log("")
    1341.log("")
    5648978949849.log("") //static L dispatch

    pi.log("")
    schoolNumber.log("")
    tcIdentityNumber.log("")

    val result: Int = "3".extPlus("5")
    val result2: Int = "3" extPlus "5"
    "3" extPlus "5" log ""

    val shape = Shape()
    shape.calculateArea(3)


}

fun log2(number: Number) { //Number classi..
    println(number)
}

infix fun Number.log(emptyParam: String) { //Number classi.. Receiver kavrami geldiginde hatirlatacagiz
    println(emptyParam + this)
}

fun String.plus(otherString: String): Int {
    return this.toInt() + otherString.toInt()
}

infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()

class Shape {
/*    fun calculateArea(edge: Int): Int{
        return edge * edge
    }*/

    fun calculateArea(edge: Int): Int = edge * edge // FONKSIYON SARI RENKTE
    fun calculateArea2(edge: Int): Int = edge * edge // CLASS BEYAZ
    /*operator fun Int.toString(){

    }*/

    fun Int.extToString(value: String) {
        println("")
        extToString("")
        println("Awesome class printi")

    }

    fun toString(value: String) {
        println("Keko class printi")
    }

    fun main() {
        3.toString()
    }

}


fun Shape.calculateArea(edge: Int): Int {
    val result = edge * edge
    println(result)
    return result.toInt()
}

fun Shape.calculateArea2(edge: Double): Int {
    val result = edge * edge
    println(result)
    return result.toInt()
}