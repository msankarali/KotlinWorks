package classes

sealed class Fruit {
    class Apple : Fruit()
    class Banana : Fruit()

    object GetFruits : Fruit()
}

fun main() {
    val apple = Fruit.Apple()
    val banana = Fruit.Banana()
    val getFruit = Fruit.GetFruits

    printFruit(apple)
    printFruit(banana)
    printFruit(getFruit)
}

fun printFruit(fruit: Fruit) {
    when (fruit) {
        is Fruit.Apple -> println("Apple")
        is Fruit.Banana -> println("Banana")
    }
}