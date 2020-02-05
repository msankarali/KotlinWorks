package classes

class School : Shape() {
    private val schoolName = "Codemy"
    val schoolType = "Online"

    class LawSchool {
        val studentCount: Int = 5000
        fun printOuterName() {
            //println("Outer School Name: $schoolName") // calismaz
            //println("Outer School Name: $schoolType") // calismaz
        }
    }

    inner class MedSchool :
        Circle("Circle") { // multi inheritance - dışarıdan bir veriye erişmek için "inner" keywordünü kullanıyoruz
        val studentCount: Int = 5000
        fun printOuterName() {
            println("Outer School Name: $schoolName")
            println("Outer School Name: $schoolType")
            println("Shape $shape")
        }

        inner class TechSchool : Shape()
    }
}

// multi inheritance yasak, ama inner class kullanarak dolayli yoldan yapabiliriz
fun main() {
    val lawSchool = School.LawSchool()
    lawSchool.printOuterName()
    lawSchool.studentCount

    val medSchool = School().MedSchool() // inner oldugu icin ilk once ust sinifin nesnesi olusturulmasi gerekiyor
    medSchool.studentCount
    medSchool.printOuterName()

    val techSchool = School().MedSchool().TechSchool()
}

// inner classta outher classta kullaniyoruz, nested classta kullanamiyoruz
// inner class kullaniyorsak outer class
// inner outerin referansini tutar