package classes

import java.util.*

class AwesomeCodemy {
    val name = "Codemy"
    var website = "Codemy.Live"
        private set // get değiştirilemiyor ama set değiştirilebiliyor. VAL website olmuş oluyor
    // field property farkı
    var deneme = mutableListOf("deneme", "2")

    var twitterAccount: String = ""
        set(value) {
            field = value.toLowerCase(Locale("tr", "TR"))

            /*
            // Sekerbank
            // sekerbank
            // ŞEKERBANK
            // şeKerbank
            // kullanıcı ne yazarsa yazsın lower case
            bankList.foreach {
                if(it.name.toLowerCase() == searchField)
            }
             */
        }

    init {
        twitterAccount = ""
    }
}

fun main() {
    val awesomeCodemy = AwesomeCodemy()
    awesomeCodemy.name
    awesomeCodemy.website

    awesomeCodemy.twitterAccount = "@msankarali"
    println(awesomeCodemy.twitterAccount)


}