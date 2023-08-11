fun main() {
    greetings("Ahmad", "Muhammad")
    greetings("Ahmad", null)
//    karna sudah di declair lastName : String? =null maka ga wajib isi parameter ke 2
    greetings("Muhammad")
    println(jumlahkan(5 , 5))
    println(bagikan(10 , 5))

    val name = "Ahmad"
    println(name.greetings())
    name.printGreeting()
    "ini function extension".printGreeting()
}


// EXTENSION FUNCTION

fun String.greetings() : String = "Hello $this"
fun String.printGreeting() : Unit = println("Hello $this")

// function dengan parameter
fun greetings (firstName : String , lastName : String? =null) {
    if(lastName == null){
        println("Good Day $firstName")
    }else {
        println("Good Day $firstName $lastName")
    }
}

// function return type

fun jumlahkan (a: Int , b: Int): Int {
    val total = a + b
    return total
}

// function single line / single expression function
fun bagikan (a : Int, b: Int) : Int = a / b