package classes

class Car2(val paramCarType: String) { //: Any()'den miras edilir // bos olan default primary constructordur
    var carType: String = paramCarType //var carType: String = paramCarType
    var carColor: String = ""
    var carType2: String

    init {
        this.carType = carType
        this.carColor = carColor
        this.carType2 = "CarType" // silinirse yukaridaki hata belirir
    }

    constructor(
        carType: String,
        carColor: String,
        carType2: String
    ) : this(carType) { //kotlin tarafından zorunlu tutuluyor eğer primary const varsa
        this.carType = carType
        this.carColor = carColor
        this.carType2 = "Cartype" // init blogunda atama olmazsa bu degiskene secondary const
    }

    fun printTypeAndColor() {
        println("carType: $carType, carColor: $carColor")
        println("carType: $paramCarType, carColor: $carColor")
    }
}

class Car3 {
    init {
        println("initialize 1")
    }

    constructor(type: String, color: String) { //secondary constructor
        println("secondaryconst")
    }

    init {
        println("initialize 2")
    }
}

class Car4 constructor() {
    constructor(type: String, color: String) : this() { //secondary constructor

    }
}

class Car(type: String = "default value") {

    val carType: String = "Metal".also {
        println(it)
    }

    init {
        println("primary const. type: $type")
        // class cagirildigi anda bu kisim initilaize edilir
    }

    constructor(type: String, color: String) : this() { //secondary constructor, this ile isaret edilmesi gerekiyor
        println("Type: $type, Color: $color")
    }

    constructor(type: String, color: String, count: Int) : this(type) { // default constructor varsa this() kullanilir

    }
}


fun main() {
    // cagirma sirasi: degisken tanimlamalari(also), init, ve constructor
    //var carInstance = Car() //default constructor // default value vererek
    //var carInstance2 = Car("MiniCooper")
    //var carInstance3 = Car("MiniCooper", "blue") // this le delegate islemi
    //var carInstance4 = Car("MiniCooper", "blue", 5)
    //var carInstance5 = Car3("BMW", "blue")

    var carInstance6 = Car2("BMW")
    //var carInstance7 = Car2("BMW", "blue")

    carInstance6.printTypeAndColor()

    //val dontCreateInstanceFromMe = DontCreateInstanceFromMe()
    //val dontCreateInstanceFromMeAbstract = DontCreateInstanceFromMeAbstract()
}


class DontCreateInstanceFromMe private constructor() { // classi private yapmak instanceinin yaratilmasina engel degil
    val instance =
        DontCreateInstanceFromMe() // private constructorlarda disaridan olusturulamaz ama iceriden olusturulabilir. Singleton.

    private constructor(number: Int) : this()
}

abstract class DontCreateInstanceFromMeAbstract {
    //val instance = DontCreateInstanceFromMeAbstract()
}


// kotlinde suslu parantezler (scopes) bos kalabilir ama javada olmak zorunda