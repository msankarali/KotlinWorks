package basictypes

fun main() {
    val firstCharName: Char = 'G'
    //val firstCharName2: Char = "G"
    val charNumber: Char = '5'
    val convertedCharNumber = charNumber.toInt()

    println("charNumber: " + charNumber)

    val escapeCharT: Char = '\t'
    val escapeCharN: Char = '\n'
    val escapeCharB: Char = '\b'
    val escapeCharR: Char = '\r'
    val escapeChar1: Char = '\''
    val escapeChar2: Char = '\"'
    val escapeCharSlash: Char = '\\'
    val escapeCharDollar: Char = '\$'

    val loremImpsun = "escapeCharT " + escapeCharT +
            "escapeCharN " + escapeCharN +
            "escapeCharB " + escapeCharB +
            "escapeCharR " + escapeCharR +
            "escapeChar1 " + escapeChar1 +
            "escapeChar2 " + escapeChar2 +
            "escapeCharSlash " + escapeCharSlash +
            "escapeCharDollar " + escapeCharDollar

    println(loremImpsun)

    val uniCode = '\u0160'
    println(uniCode)
}