package basictypes

fun main() {
    val pi: UInt = 3.15.toUInt()

    val schoolNumber: Byte = 126 //explicit, implicit type convertion
    val convertedValue = schoolNumber.toByte()
    val tcIdentityNumber = 123456789012345
    println("schoolNumber: " + schoolNumber)
    println("convertedValue: " + convertedValue)

    val totalValue: Long = tcIdentityNumber + schoolNumber
    // implicit type convertion yok!
}