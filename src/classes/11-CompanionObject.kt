package classes

class Photo {
    val photoUrl1 = "${BASE_URL}1010101010"
    val photoUrl2 = "${BASE_URL}12312312312312"
    val photoUrl3 = "${BASE_URL}23423423423423432"
    val photoUrl4 = "${BASE_URL}34534534534534534543543"

    fun printAll() {
        println(photoUrl1)
        println(photoUrl2)
        println(photoUrl3)
        println(photoUrl4)
    }

    companion object Yoldas {

        const val NAME = "Codemy"

        /*
        Eğer Deafult değeri olan parametrelere sahip bir fonksiyonu Java classlarında çağracaksak @JvmOverloads annotaion’ını fonksiyonun başına eklememiz gerekir.
        birden fazla url icin jvmstatic kullanmazsak, bu degisken icin singletoni birakiyor, static kullanimina geri donuyor.
        bu da su yuzden onemli: diger siniflardan veri cekebilecek iki tane metod yaziyor. disaridanda erisebiliyoruz

         */
        @JvmStatic // birden fazla aynı isimdeki metodun uyumlu çalışabilmesi için jvm overload yapıyorduk
        var BASE_URL = "www.google.com.tr/"

        fun print() {

        }
    }
}

fun main() {

    val photo = Photo()
    photo.printAll()

    Photo.BASE_URL = "www.yandex.com.tr/"

    val photop2 = Photo()
    photop2.printAll()
}