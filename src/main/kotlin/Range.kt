fun main() {

//    membuat range dari 1 sampai 100

    val range = 1..100

//    menghitung jumlah dalam range
    println(range.count())
//    melihat angka 50 ada atau tidak dalam data ==>> hasilnya akan true
    println(range.contains(50))
//    melihat angka 200 ada atau tidak dalam data ==>> hasilnya akan false
    println(range.contains(200))
//    angka pertama dalam range
    println(range.first)
//    angka terakhir dalam range
    println(range.last)
//    mendapatkan nilai tiap kenaikan
    println(range.step)

    println("============================================================")
//    membuat range dari 1 sampai 100

    val rangeDownTo = 100 downTo 1

//    menghitung jumlah dalam rangeDownTo
    println(rangeDownTo.count())
//    melihat angka 50 ada atau tidak dalam data ==>> hasilnya akan true
    println(rangeDownTo.contains(50))
//    melihat angka 200 ada atau tidak dalam data ==>> hasilnya akan false
    println(rangeDownTo.contains(200))
//    angka pertama dalam rangeDownTo
    println(rangeDownTo.first)
//    angka terakhir dalam rangeDownTo
    println(rangeDownTo.last)
//    mendapatkan nilai tiap kenaikan
    println(rangeDownTo.step)


    println("============================================================")
//    membuat range dari 1 sampai 100

    val rangeDowntoStep = 100 downTo 1 step 5

//    menghitung jumlah dalam rangeDowntoStep
    println(rangeDowntoStep.count())
//    melihat angka 50 ada atau tidak dalam data ==>> hasilnya akan true
    println(rangeDowntoStep.contains(50))
//    melihat angka 200 ada atau tidak dalam data ==>> hasilnya akan false
    println(rangeDowntoStep.contains(200))
//    angka pertama dalam rangeDowntoStep
    println(rangeDowntoStep.first)
//    angka terakhir dalam rangeDowntoStep
    println(rangeDowntoStep.last)
//    mendapatkan nilai tiap kenaikan
    println(rangeDowntoStep.step)


}