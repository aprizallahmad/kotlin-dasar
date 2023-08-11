fun main() {

    val names : Array<String> = arrayOf("Eko", "Joko", "Budi")
// val tipnya immutable, tapi masih bisa di rubah isinya datanya , kalau rubah menjadi baru, baru tidak bisa
    names[0] = "Eki"
    val data : String = names.joinToString(", ")
//    val dataAll : String = names[]
    println(names)
    // [Ljava.lang.String;@2f4d3709 munculnya akan seperti ini

    println(data)
}
