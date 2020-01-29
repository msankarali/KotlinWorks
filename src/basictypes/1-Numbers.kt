package basictypes

fun main(args: Array<String>): Unit {
    /*
    Kotlin is a STATICALLY-TYPED and CASE SENSITIVE language. It means that EVERY VARIABLE and EVERY EXPRESSION has a TYPE.
    There are two main keywords to define variables. 'val' and 'var'.
        -> 'val' comes from 'value' and denotes a READ-ONLY or ASSIGNED-ONCE(cannot be reassigned) variable.
            Do not forget: it is IMMUTABLE! It corresponds to a 'final' in Java.
                • You can OMIT the TYPES OF VARIABLES and the COMPILER INFERS the TYPES. But writing them is OFFERED.
                    ¯ The DEFAULT of the NUMBER VARIABLES are 'Int'
                • You can INITIALIZE the 'val' when first INFERRED or DEFERRED(If the type is specified)
            */

    // READ-ONLY Example
    val readOnlyVal: Int = 5
    // readOnlyVal = 4 // Cannot be reassigned

    // ASSIGNED-ONE
    val assignedVal1 = 5 // first INFERRED
    val assignedVal2: Int
    assignedVal2 = 4 // DEFERRED

    // INFERENCE TYPES
    val valByte = 125
    val valShort = 32000
    val valInt = 1_234_567_890
    val valLongWithOrWithoutL = 123_4567_8901_2345_6789L
    val valFloat = 3.40282346638528860e+38
    val valFloatWithF = 3.40282346638528860e+38F
    val valDouble = 1.79769313486231570e+307
    val valChar = 'A'
    val valString = "A String Boi"
    println("valByte is " + valByte.javaClass.name)
    println("valShort is " + valShort.javaClass.name)
    println("valInt is " + valInt.javaClass.name)
    println("valLongWithOrWithoutL is " + valLongWithOrWithoutL.javaClass.name)
    println("valFloat is " + valFloat.javaClass.name)
    println("valFloatWithF is " + valFloatWithF.javaClass.name)
    println("valDouble is " + valDouble.javaClass.name)
    println("valChar is " + valChar.javaClass.name)
    println("valString is " + valString.javaClass.name)

    val mutableList = mutableListOf("Muharrem")
    mutableList.add("Servet")
    mutableList.add("ANKARALI")
    println(mutableList)

    val immutableReadOnlyList = listOf("Muharrem", "Servet")
    // immutableList.add("ANKARALI") //
    println(immutableReadOnlyList)


    fun max(a: Int, b: Int) = if (a > b) a else b

    /*
        // Definition: MUTABLE = variables can be changed
        -> 'var' comes from 'variable' and denotes a MUTABLE variable.
        -> for the performance, it is not that offered to be used
     */
    //var isThisReallyAVar: Int = 5
    //isThisReallyAVar = "GG".toInt()


    /**
     *      Boxed   : Degiskenin obje referansi olarak tutulmasidir.
     *      UnBoxed : Degiskenin primitive olarak tutulmasidir.
     *     ===  operatoru degiskenlerin referansını karsilastirirken kullanilir.
     *     ==   operatoru degiskenlerin degerini karsilastirirken kullanilir.
     */

    val number: Int = 10000
    println(number === number) // true
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number
    println(boxedNumber === anotherBoxedNumber) // false

    val number2: Int = 10000
    println(number2 == number2) // true
    val boxedNumber2: Int? = number2
    val anotherBoxedNumber2: Int? = number2
    println(boxedNumber2 == anotherBoxedNumber2) // true

    /**
     *      Backend'ten donen Double ve Float degiskenleri kullanirken dikkatli olmaniz gerekiyor.
     *      Eger backend'ten donen deger uzerinde "." isaretine gore bir split isi yapacaksaniz basiniz agriyabilir.
     *      Cunku backend'ten donen Double ve Float degiskenleri her zaman "." ile ayrismiyor olabilir.
     *      Database dilinin farkli olmasina gore (turkce-ingilizce gibi) "." yerine "," ile de ayrisiyor olabilir.
     */


    //println("Miss (but, really, mis..)")
}