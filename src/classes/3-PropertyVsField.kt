package classes

class AwesomeCodemy {
    val name = "Codemy"
    var website = "Codemy.Live"
        private set // get değiştirilemiyor ama set değiştirilebiliyor. VAL website olmuş oluyor
    // field property farkı
    var deneme = mutableListOf("deneme", "2")

}

fun main() {
    val awesomeCodemy = AwesomeCodemy()
    awesomeCodemy.name
    awesomeCodemy.website
    

}