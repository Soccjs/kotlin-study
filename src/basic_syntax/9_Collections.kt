package basic_syntax

fun main() {

    for (item in items) {
        println(item)
    }


    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    // Using lambda expressions to filter and map collections:
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}