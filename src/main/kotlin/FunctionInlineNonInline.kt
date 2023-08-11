// inline dipakai untuk mengoptimalkan ketika ada perulangan dalam function

// gunakan dengan bijak karna inline membutuhkan resource yg lebih besar dari function biasa
inline fun hello(
    firstName : () -> String,
//    noinline dipakai untuk membuat paramater menjadi inline
    noinline lastName : () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    println(" >>>>>> ${hello({ "Muhammad" }, {"Ibnu Athoillah"} )}  ")

    for(i in 0..100){
        println (hello ({ "Muhammad" }, {"Ibnu Athoillah"} ) )
//        println ("ini i ke $i")
    }
}

// lihat perbedaannya kompilasi di Tools >>> Kotlin >>> show Kotlin ByteCode >>> klik Decompile
