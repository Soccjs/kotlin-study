package basic_syntax

// Nullable values and null checks
// A reference must be explicitly marked as nullable when null value is possible.
// Return null if str does not hold an integer:

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun main() {
    println(parseInt("5"))
    println(parseInt("a"))
}