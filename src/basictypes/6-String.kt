package basictypes

fun main() {
    val name = "Codemy"
    val char1 = 'C'
    val char2 = 'o'
    val char3 = 'd'
    val char4 = 'e'
    val char5 = 'm'
    val char6 = 'y'
    val nameArray = charArrayOf(char1, char2, char3, char4, char5, char6)

    for (char in name) {
        print(char)
    }

    val numberValue = "value" + (4 + 2 + 8) + " | gg"
    println(numberValue)

    println("numberValue $numberValue")

    val rawPineTree = """
        $   *
       $   ***
          *****
        **(EZPZ)**
    """.trimMargin("$") // .trimIndent() sola en yakına göre

    println(rawPineTree)
    println("${rawPineTree.length}")
}