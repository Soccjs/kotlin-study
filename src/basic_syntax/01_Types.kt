package basic_syntax

// Numbers
// - Byte	8	-128	127
// - Short	16	-32768	32767
// - Int	32	-2,147,483,648 (-231)	2,147,483,647 (231 - 1)
// - Long	64	-9,223,372,036,854,775,808 (-263)	9,223,372,036,854,775,807 (263 - 1)
// - Float	32	24	8	6-7
// - Double	64	53	11	15-16


// Underscores in numeric literals (since 1.1)
val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010

// Characters
// - Char

// Booleans
// - Boolean (true, false)

// Primitive type arrays


fun main() {
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1
    val pi = 3.14 // Double
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817


    // Arrays
    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
}


