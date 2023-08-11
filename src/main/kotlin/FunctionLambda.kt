
import java.util.*
// lambda tidak cocok untuk digunakan jika functionnya sudah komplex


fun main() {
// Lambda
    val contohLambda : (String, String) -> String = {
        firstName : String,
            lastName : String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Muhammad", "Ibnu Athoillah")
    println(result)

//    it hanya bisa digunakan jika Variable dalam function hanya ada 1
    val sayHello : (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Adiba Jiharkah"))

//    Lambda Method References atau Nested Function
    println(transformWords("muhammad ibnu athoillah >>>>", ::toUpper )) // ini method reference nya memanggil fun toUpper

    fun hello(name : String , transformer : (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val result2 = hello("Muhammad",  { value : String -> value.lowercase()})
    val result3 = hello("Muhammad")  { value : String ->
        value.lowercase()
    }
}


fun transformWords(value: String, transformFunction : (String) -> String): String {
    return value.split(" ").joinToString(" ", transform = transformFunction)
}

fun toUpper(value :String) : String = value.replaceFirstChar {
    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
}


