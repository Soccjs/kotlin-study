// Creating DTOs (POJOs/POCOs)
data class Customer(val name: String, val age: Int = 0)

fun main() {
    val juns = Customer("준스", 30)
    val latte = Customer("라떼")

    println(juns)
    println(latte)

    val prevJuns = juns.copy(age=28)
    println(prevJuns)

//    Filtering a list
    var list = listOf("ABC", "AAA", "CCC")
    list = list.filter { it -> it.startsWith("A") }
    println(list)

//    String Interpolation
    println("Juns age = ${juns.age}")

//    Instance Checks
    println("instance type is ${describe(juns)}")

//    Ranges
    for (i in 1..5) { print(i) }  // closed range: includes 100
    println()
    for (i in 1 until 5) { print(i) } // half-open range: does not include 100
    println()
    for (i in 2..5 step 2) { print(i) }
    println()
    for (i in 5 downTo 1) { print(i) }
    println()

//    Lazy Property
    var a = 1
    var b = 2
    val p: Int by lazy {
        a + b
    }
//    println(p) // 3
    a = 3
    println(p) // 5

//    Extension Functions
    fun Customer.hello() = println("hello $name")
    juns.hello()
    latte.hello()

//    Creating a singleton
    val singletonCustomer = SingletonCustomer
    println(singletonCustomer)

//    If not null shorthand
    println(list?.size)
//    If not null and else shorthand
    println(list?.size ?: "empty")

//    Executing a statement if null
    val aaa = list[0] ?: throw IllegalStateException()

//    Execute if not null
    val juns2 = juns.copy(name = "준석")

    juns2?.let {
        println(it.name)
    }


}
object SingletonCustomer{
    val name = "홍길동"
    val age = 30
}

fun describe(juns: Any) : String{
    return when (juns) {
        is Customer -> "Customer"
        !is Customer -> "no Customer"
        else -> "UNKNOWN"
    }
}
