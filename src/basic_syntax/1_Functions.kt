package basic_syntax

fun sum1(a: Int, b: Int): Int {
    return a + b
}
fun sum2(a: Int, b: Int) = a + b
fun sum3(a: Int, b: Int): Int = a + b


// Unit 타입은 Java의 보이드와 유사함.
// Unit 타입은 인자로도 사용할 수 있습니다.
fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}


fun main() {
    printSum1(2, 3)
    printSum2(2, 3)
}

