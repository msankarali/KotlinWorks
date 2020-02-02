package classes

// name ve ordinal degiskenleri default olarak final oldugu icin override edilemezler
// open bir classi miras almaya izin verilmez. ancak bir interface'i implement edilebilir
// abstract,

interface IDeneme {
    fun check()
}

enum class DirectionType(val code: Int) : IDeneme { // , val type: String
    EAST(100) {

        override fun toString(): String {
            return "East"
        }

        override fun printFullValue() {
            print("name: ${EAST.name}, position: ${NORTH.ordinal}")

        }

        override fun check() {

        }
    },
    WEST(200) {
        override fun toString(): String {
            return "West"
        }

        override fun printFullValue() {
            print("name: ${WEST.name}, position: ${NORTH.ordinal}")

        }

        override fun check() {

        }
    },
    SOUTH(300) {
        override fun toString(): String {
            return "South"
        }

        override fun printFullValue() {
            print("name: ${SOUTH.name}, position: ${NORTH.ordinal}")

        }

        override fun check() {

        }
    },
    NORTH(400) {
        override fun toString(): String {
            return "North"
        }

        override fun printFullValue() {
            print("name: ${NORTH.name}, position: ${NORTH.ordinal}")
        }

        override fun check() {

        }
    };

    abstract fun printFullValue() // enum classlara abstract class yazilabilir. Kendini ezdirmek icin
}

fun main() {
    DirectionType.EAST
    DirectionType.WEST
    DirectionType.NORTH
    DirectionType.SOUTH

    setDirection("East", 1)
    setDirection("West", 2)
    setDirection("North", 3)
    setDirection("South", 4)

    println()

    setDirection(DirectionType.EAST.name, DirectionType.EAST.ordinal)
    setDirection(DirectionType.WEST.name, DirectionType.WEST.ordinal)
    setDirection(DirectionType.SOUTH.name, DirectionType.SOUTH.ordinal)
    setDirection(DirectionType.NORTH.name, DirectionType.NORTH.ordinal)

    println()

    setDirection(DirectionType.EAST.toString(), DirectionType.EAST.ordinal)
    setDirection(DirectionType.WEST.toString(), DirectionType.WEST.ordinal)
    setDirection(DirectionType.SOUTH.toString(), DirectionType.SOUTH.ordinal)
    setDirection(DirectionType.NORTH.toString(), DirectionType.NORTH.ordinal)

    println()

    DirectionType.EAST.printFullValue()
    DirectionType.WEST.printFullValue()
    DirectionType.SOUTH.printFullValue()
    DirectionType.NORTH.printFullValue()

    println()

    DirectionType.EAST.code.log()
    DirectionType.WEST.code.log()
    DirectionType.SOUTH.code.log()
    DirectionType.NORTH.code.log()

    val directionType = DirectionType.NORTH
    when (directionType) {
        DirectionType.EAST -> {
            DirectionType.EAST.toString()
        }
        DirectionType.WEST -> {
            DirectionType.EAST.toString()
        }
        DirectionType.SOUTH -> {
            DirectionType.EAST.toString()
        }
        DirectionType.NORTH -> {
            DirectionType.EAST.toString()
        }
    }

    val directionType2 = readLine()!!.toString()
    val redirectType2 = when (directionType2) {
        "East" -> {
            "EAST"
        }
        "WEST" -> {
            "WEST"
        }
        "SOUTH" -> {
            "SOUTH"
        }
        "NORTH" -> {
            "NORTH"
        }
        else -> "" // enum kullanilmayinca else belirtmek zorunda kaliyoruz
    }
}

fun setDirection(direction: String, position: Int) {
    println("Direction: $direction and its position is $position")
}

fun Int.log() {
    println("Direction code is: $this")
}