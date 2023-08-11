fun main() {
// fungsi label untuk :
//     mengintegrasikan dengan penggunaan break , continue dan return
//     untuk menjalankan proses (break, continue dan return) di tempat label berada

   labelBreak()
    labelContinue()
}

fun labelBreak() {
    loopI@ for(i in 1..10){
//        if(i > 5  ) {
//            println("i sudah sampai >>> $i maka di break ")
//            break@loopI
//        }

        loopJ@ for(j in 1..10){
            println("$i * $j = ${i *j}")

            if(i > 5  ) {
                println("i sudah sampai >>> $i maka di break ")
                break@loopI
            }
        }
    }
}
fun labelContinue() {
    loopI@ for(i in 1..10){
//        if(i > 5  ) {
//        println("i sudah sampai >>> $i maka di lewatkan ")
//        continue@loopI
//        }

        loopJ@ for(j in 1..10){
            println("$i * $j = ${i *j}")
            if(i > 5  ) {
                println("i sudah sampai >>> $i maka di lewatkan ")
                continue@loopI
            }
        }
    }
}