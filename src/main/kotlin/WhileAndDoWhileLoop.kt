fun main() {
    var i = 0
// WHILE LOOP >>>>
    println("==============================================")

    while(i < 10){
        println("ini loop ke $i")
        i++
    }
    println("Done While Looping >>>>")

//  DO WHILE LOOP >>>>>
    println("==============================================")

//    var x = 0
    var x = 11

    do {
        println("do ke $x")
        x++
    }while (x < 10)

    println("Done Do While Looping >>>>")
//   WHILE LOOP and BREAK STATEMENT >>>>>
    println("==============================================")
    var y = 0
    while(true) {
        println("Break Me ke $y")
        y++

        if(y > 100) {
//            jika sudah mencapai 100 pengulangan akan berhenti
            break
        }
    }



}