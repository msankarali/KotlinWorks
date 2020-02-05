package classes

object SingletonKotlin {
    var color: String = "blue"

    fun printColor() {
        println("color $color")
    }
}

fun main() {
    SingletonKotlin.color = "red"
    SingletonKotlin.printColor()

    SingletonKotlin.color = "green"
    SingletonKotlin.printColor()
}