////fun main(){
////    for(i in 1..10){
////        if(i ==3){
////            break
////        }
////        println(i)
////
////    }
////}
//
//
//fun main() {
//// Normal break వాడితే
////    for (i in 1..3) {
////        for (j in 1..3) {
////            if (i == 2) break
////            println("i = $i and j = $j")
////        }
////    }
//    ////////Labeled break Example////
////    loop@ for(i in 1..3){
////        for(j in 1..3){
////            println("i = $i and j= $j")
////            if(i==2)break@loop
////        }
//
//
//        first@ for (i in 1..3) {          // బయటి loop
//            second@ for (j in 1..3) {     // మధ్య loop
//                for (k in 1..3) {         // లోపలి loop
//                    println("i =$i and j = $j and k = $k")
//
//                    if (k == 2) break@second  // మధ్య loop ఆపు
//                    if (j == 2) break@first   // బయటి loop ఆపు
//                }
//            }
//        }
//    }
