package classes

open class Shape { //open extend yani miras alinabilir bir sinif oldugu belirtilmeli
    open val shape: String = ""

    open fun draw() { // override icin open keyword
        println(shape)
    }

    fun fill() {

    }
}

class Rectangle : Shape() {

    override val shape: String
        get() = """
        ***********
        *         *
        ***********
    """.trimIndent()

    override fun draw() {
        super.draw()
        println("Rectangle created")
    }
}

class Triangle : Shape() {
    init {
        fill()
    }

    override val shape: String
        get() = """
           ****
          *    *
        ***********
    """.trimIndent()

}

fun main() {
    val triangle = Triangle()
    val rectangle = Rectangle()

    triangle.draw()
    rectangle.draw()
}





