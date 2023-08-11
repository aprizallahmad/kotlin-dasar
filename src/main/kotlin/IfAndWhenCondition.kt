fun main() {

    var finalExam = 'D'
    when (finalExam){
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println(" Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        'E' -> {
            println("Bad")
        }
        else -> {
            println("Ups Error")
        }
    }

//    when multiple option / groove

    when(finalExam){
        'A', 'B', 'C' -> {
             println("You passsed the Test")
        }
        else -> {
            println("Sorry, You don't passed the Test")
        }
    }
    finalExam = 'A'
    val finalExam2 = "huft"
//    val nilaiLulus = 'A'..'C'

    val nilaiLulus: Array<Char> = arrayOf('A', 'B', 'C',)
    val nilaiLulus2: Array<String> = arrayOf("Amazing", "Good", " Not Bad")

    when (finalExam) {
        in nilaiLulus  -> println("Congrats...!!!")
        else -> println("Sorry.... :(")
    }
    when (finalExam2) {
        in nilaiLulus2 -> println("Yeaaayyy")
        else -> println("uh oh...!")
    }

//  Type mismatch: inferred type is Char but String was expected  https://youtrack.jetbrains.com/issue/KT-31893

    println(returnIfWhen())
    println(returnIfWhen("Ahmad"))
}


fun returnIfWhen (name : String = ""): String {
    println("======================== return if example")
    return if ( name == "" ) {
        "Hello Akhi......!!!"
    } else {
        "Hello $name"
    }
}