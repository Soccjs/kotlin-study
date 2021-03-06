package basic_syntax

fun main() {
// Check if a number is within a range using "in" operator:
    val x = 10
    val y = 11
    if (x in 1..y+1) {
        println("fits in range")
    }

// Check if a number is out of range:
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    for (t in 1..5) {
        print(t)
    }
    println()
    for (t in 1..10 step 2) {
        print(t)
    }
    println()
    for (t in 9 downTo 0 step 3) {
        print(t)
    }
}