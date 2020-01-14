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
}

https://kotlinlang.org/docs/reference/basic-syntax.html?&_ga=2.43411116.808851200.1578972809-1259176700.1578972809#using-nullable-values-and-checking-for-null