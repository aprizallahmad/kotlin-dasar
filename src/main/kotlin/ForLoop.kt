fun main() {
    val names : Array<String> = arrayOf("Eko", "Joko", "Budi", "Akib", "Ilham")

    for (name in names){
        println(name)
    }

    for (i in 0..100  ){
//        for (i in 0..100 step 10){
//            for (i in 0..100 step 10){
        println(i)
    }

    val arrayLength = names.size -1
    for (i in 0..arrayLength){
        println(" ini data names >>>>> ${names[i]}")
    }
}