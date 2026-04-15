//fun main() {
//    println("Enter age:")
//    var age = readLine()?.toInt() ?: -1
//    //                            ^^^^
//    //                   null వస్తే -1 వాడు
//
//    if (age == -1) {
//        println("Enter only digits!")   // null అయినప్పుడు
//    } else if (age >= 18) {
//        println("Eligible for Vote")
//    } else {
//        println("Not Eligible For Vote")
//    }
//}
//
//fun main() {
//    val firstName: String? = null
//    val lastName: String? = null
//    val nickName: String? = "Sekhar"
//
//    // ముందు firstName చూడు, null అయితే lastName చూడు,
//    // అదీ null అయితే nickName వాడు
//    val displayName = firstName ?: lastName ?: nickName ?: "Unknown"
//
//    println("Name: $displayName")
//}