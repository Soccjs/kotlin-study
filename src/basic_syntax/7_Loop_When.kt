package basic_syntax

val items = listOf("apple", "banana", "kiwifruit")

fun main() {
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println(describe(1))
    println(describe(2))
    println(describe(3))
    println(describe("4"))
    println(describe(1L))
}


fun describe(obj: Any): String =
    when (obj) {
        1    -> "One"
        2    -> "Two"
        3    -> "Three"
        is String -> "string"
        else       -> "Unknown"
    }