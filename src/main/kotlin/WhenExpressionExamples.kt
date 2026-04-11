
//fun main(args:Array<String>){
//    val day="Sunday"
//    when(day){
//        day->"Monday"
//
//    }
//}

//fun main() { /////Using When as an Expression////
//    val num=5
//
//   val result=when(num){
//        1->"One"
//        2->"Two"
//        3->"Three"
//        4->"Four"
//        5-> println("Five")
//        6->"Six"
//        else->"Invalid Number"
//    }
//    println("You Provide: $result")

//    val day=6
//    val weekendLeaves= when(day) {
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturaday"
//        7 -> "Sunday"
//      }
//
//
//
//    println("Enter number (1 to 7):")
//    val number=readLine()?.toIntOrNull()//////readLine() always return string////
//
//    val weekendLeaves= when(number) {
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturaday"
//        7 -> "Sunday"
//        null -> println("Enter Only 1 to 7")
//        else -> println("Exit")
//    }

//}


//fun main(){   //////Using When Without Expression////
//    val num="7"
//
//    when(num){
//        "1"-> println("Monday")
//        "2"-> println("Tuesday")
//        "3"-> println("Wednesday")
//        "4"-> println("Thurssday")
//        "5"-> println("Friday")
//        "6"-> println("Saturday")
//        "7" -> println("Sunday")
//    }
////    println("Your Day is ... $num")
//}


//fun main(){ /////Multiple Statement When using Braces////
////     var number=1
////    when(number){
////        1->{
////           println("Monday")
////            println("First day of the week")
////        }
////        7 ->{
////            println("Sunday")
////            println("Lat day of the weekend")
////        }
//
//    }




//fun main(){/////Multiple Branches of When////
//
//    val month=3
//    val month1=6
//    val result=when(month){
//        1,2,3->{
//            println("Summer Season")
//        }
//        4,5,6->{
//            println("rainy season")
//        }
//        7,8,9->{
//            println("Winter season")
//        }else -> {
//            println("Inavlid season")
//        }
//    }
//}



























