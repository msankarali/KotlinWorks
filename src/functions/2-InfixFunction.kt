package functions

import kotlin.math.pow

fun main() {
    val isStudent = false
    val isMale = true

    if (isStudent and isMale) {
        println("Öğrenci olan erkek")
    }
    if (!isStudent.and(isMale)) {
        println("Öğrenci olmayan erkek")
    }

    val result = Math.pow(2.0, 3.0)
    val result2 = 2.0.pow(3)

    val awesomeInstance = AwesomeClass()
    awesomeInstance downloadImage "www.google.com" // classlarda hatirlat

    val number = 5
    if (number + number * 2 * awesomeInstance.specialPlus(4) == 5) {

    }

    //if (number == 3 && number < 5 || awesomeInstance.specialPlus 4 == 4)
}
/*
infix fun downloadImage(){
//kullanabilmek icin extension method yada classin icinde bir method olmasi lazim
}
*/

class AwesomeClass {
    infix fun downloadImage(imageUrl: String) { //imageUrl: String = "ddsa" YAPILAMAZ!

    }

    fun logWhenImageDownloaded(imageUrl: String) {
        // downloadImage(imageUrl)
        this downloadImage imageUrl
    }

    infix fun specialPlus(number: Int): Int {
        return number
    }


    /*
    infix fun <T> downloadImage2(vararg mageUrl : T){ //imageUrl: String = "ddsa" YAPILAMAZ!

    }*/


}

