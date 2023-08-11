fun main() {

    fun hello (name :String , transformer : (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value : String) : String {
        if ( value == "") {

        return "UPs"
        } else {
            return value.uppercase()
        }
    }

    println(hello("Muhammad", upper))
    println(hello("", upper))

}


