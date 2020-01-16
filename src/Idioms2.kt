import java.math.BigDecimal
import kotlin.math.abs

// try catch
fun test() {
    val result = try {
        abs(25)
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
    // Working with result
}

// if
fun foo(param: Int) {
    val result = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else {
        "three"
    }
}

// Builder-style usage of methods that return Unit
fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

fun main() {
    val minusOnes = arrayOfMinusOnes(5)
    println(minusOnes[0])
    println(minusOnes[1])
    println(minusOnes[2])
    println(minusOnes[3])
    println(minusOnes[4])

    // swap
    var a = 1
    var b = 2
    println("$a $b")
    a = b.also { b = a }
    println("$a $b")

    calcTaxes()
}

// Single-expression functions
fun theAnswer1() = 42
// This is equivalent to
fun theAnswer2(): Int {
    return 42
}

// TODO(): Marking code as incomplete
// Kotlin's standard library has a TODO() function that will always throw a NotImplementedError
fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")

