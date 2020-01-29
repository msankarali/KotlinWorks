package classes

open class Shape { //open extend yani miras alinabilir bir sinif oldugu belirtilmeli
    open val shape: String = "Empty" //val ile olusturulan sadece get, var ise get ve set
    open val color: String = "Black"
    open var edge = 0

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

class Square : Shape()

open class Circle(override val shape: String) : Shape() {
    //final override var color: String = ""
    //    get() = super.color
    // class private iken, ayni dosya icerisinde farkli bir class'ta instance yaratmaya izin veriliyor. ancak bu instance'in kendiside private olmak zorunda
    override var color: String = ""
        get() = "Blue"
    override var edge: Int
        get() = super.edge
        set(value) {}

    //fun fill() {}
}

class FinalShape {
    open val name: String = ""

    // override val name: String = "qweqwe"
}

class ChildCircle : Circle("Circle") { //
    protected val number: Int = 5
    // protected Top level'da kullanilmaz
    override var color: String
        get() = "White"
        set(value) {}

    /*
    override var color: String
    get() = super.color
    set(value) {}
    */

    // all we need to know is public, private, protected and internal
}

//class Hexagon: FinalShape()


fun main() {
    val triangle = Triangle()
    val rectangle = Rectangle()
    val square = Square()
    val circle = Circle("0")
    val circle2 = ChildCircle()

    triangle.draw()
    rectangle.draw()
    square.draw()
    println(circle.color)

    circle2.color
}





