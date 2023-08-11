fun main() {


    fun hello (name :String , transformer : (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }
    val lambdaUpper = { value : String -> value.uppercase()}
    println(hello("Muhammad" , lambdaUpper))
    println(hello ("Athoillah" , { value : String -> value.lowercase()}))

}