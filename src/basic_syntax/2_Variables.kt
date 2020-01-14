package basic_syntax

// val
// Read-only local variables are defined using the keyword val.
// They can be assigned a value only once.
// need to initialize
val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred


// var
// Variables that can be reassigned use the var keyword:
//fun main() {
//    var x = 5 // `Int` type is inferred
//    x += 1
//    println("x = $x")
//}

val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

fun main() {
    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
}