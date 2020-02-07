package classes

open class TextView(text: String) { // abstract veya open olmasi yeter
    open val textSize: Int = text.length
}

interface OnTextChanged {
    fun textChanged()
}

fun main() {
    val textMessage = "Codemy"
    val textView = object : TextView(textMessage),
        OnTextChanged { // , [interface] islemiyle interface eklemek istedigimizi belirtiyoruz

        val onTextChanged = this

        override val textSize: Int // ust degisken open oldugu icin override yapabiliyoruz
            get() = textMessage.length + 1

        override fun textChanged() {

        }

    }

    val studentName = "Servet"
    val studentAge = 27

    val student = object {
        val name = "Servet"
        val age = 27

        val prepStudent = object {
            val name = "PrepStudent"
            val age = "07"
        }
    }

    student.name
    student.age

    student.prepStudent.name

    val textView2 = object : TextView("dsa") {}
}

/*
class ChildTextView(val text: String) : TextView(text), OnTextChanged {
    override val textSize: Int
        get() = super.textSize

    override fun textChanged() {
    }
}*/