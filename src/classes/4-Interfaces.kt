package classes

// abstract classlar interface'lerin yapabildigi herseyi yapabilirler.
// abstractlar stateleri saklayabilir (fieldlari)
// interface'ler state tutabilir. ama bad practice. garbage collector tarafindan temizlenmez
// state tutabilir
// interface -> implement
// interface'e body verildiginde override edilmesi gerekmiyor
// interface bir class degil

fun String.log() {
    println(this)
}

interface AnimalEvent { // final kullanilmaz, cunku interface uzerindeki metodlari override etmek ister
    /* init { } kullanilamaz */


    val animalName: String

    fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) { // field ve properties farki burada onemli

        // set(value){field=value}
        // field

        when (this::class.simpleName.toString()) { // this::class.simpleName.toString() -> Implement edilen ismi alir
            "Fist" -> {
                "Fish".log()
            }
            "Bird" -> {
                "Bird".log()
            }
            "Cats" -> {
                "Cats".log()
            }

        }
        //println("$isFly, $isSwim, $isWalk")
    }

    fun makeSound() {
        println("Make a sound") // interface'in icerisindeki method body'ye sahipse override etmek zorunda degiliz. default olarak ataniyor
    }

    fun eat(isCarnivorous: Boolean)

    fun isNeedOxygen() {}
}

interface WalkEvet {
    fun slowSpeedWalk()
    fun fastSpeedWalk()
}

class Fish(override val animalName: String) : AnimalEvent, Animal(), WalkEvet {
    override fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) {
        // super.move(isFly, isSwim, isWalk)
    }

    override fun eat(isCarnivorous: Boolean) {

    }

    override fun slowSpeedWalk() {

    }

    override fun fastSpeedWalk() {

    }

}

class Bird : AnimalEvent {
    override val animalName: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) {

    }

    override fun eat(isCarnivorous: Boolean) {
        // super.eat() super body veremiyoruz
    }


}

class Cats : Animal(), AnimalEvent {
    override val animalName: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) {
        super<Animal>.move(isFly, isSwim, isWalk)
        super<AnimalEvent>.move(isFly, isSwim, isWalk)
    } // fun move'u tekrar override etmeye gerek kalmiyor. cunku Animal() sinifinda zaten override ediyor

    //

    override fun eat(isCarnivorous: Boolean) {

    }

}
/*class Cats: Animal() { // class Cats: Animal(), Plant()
    override fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) {
        super.move(isFly, isSwim, isWalk)
    }
}*/

open class Animal {
    open fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) { // *open deleted*
        //println("isFly: $isFly")
    }
}

open class Plant

fun main() {
    val cats = Cats()
    val bird = Bird()
    val fish = Fish("Fish")
    cats.move(false, false, true)
    bird.move(true, false, true)
    fish.move(false, true, false)
}

abstract class BaseAnimal {
    // abstract val name: String = "Kangal"
    abstract val name: String
    open val animalType: String = ""
    val animalColor = "Blue"

    abstract fun printName()
    open fun printName2() { // override edilmesi gerekmiyor
        println("pN")
    }
}


class SivasKangali(override val name: String) : BaseAnimal() {
    override val animalType: String
        get() = super.animalType

    override fun printName() {

    }


}