//fun main() {
//    println("Hello World!")
//}

//fun main() {
//     val name = "John"
//    println("Hello, $name")
//}

//fun main() {
//    var name = "John"
//    name="sekhar"
//    println(name)
//}
//fun main() {
//    val Int=1234
//    val char='a'
//    val boolean=true
//    val string="Hello World"
//    val double=12.34
//    val long=1234L
//    val float=12.34f
//    val short=1234L
//    println(Int)
//    println(char)
//    println(boolean)
//    println(string)
//    println(double)
//    println(long)
//    println(float)
//    println(short)
//}

//fun main() {
//    val int1=1234
//    val int2=1234
//    val int3=234
//    println(int1*int2*int3)

//    val name1="sekhar"
//    val name2="smart"
//    println("Hello! my name is $name1$name2")
//
//    val Name = "pandu"
//    val password = "sekhar1431"
//    val age = 25
//    val lockerPin = 1234
//    println("Hello my name is $Name & my age is $age")
//    println("my locker pin is $lockerPin & my locker password is $password")
//
//    val Name = "Sekhar"
//    val company = "AGSOS"
//    val WorkLocation = "Nellore"
//    val advance = 25000
//    val Salary = 100000
//    println("My name is $Name Recently i got a job in $WorkLocation my company name is $company")
//    println("My salary is $Salary i all ready taken some advance $advance")
//    println(Salary-advance)

//
//    val Name: String = "Sekhar"
//    val company: String = "AGSOS"
//    val age: Boolean = true
//    val Distance: Double = 30.5
//    val Employeeid: Long = 1234L
//    val Salary: Double = 10000.0
//      val age:Int = 10


//    val name = "sekhar"
//    val age1 = 30
//    val age2 = 30
//    val distance: Double = 30.2
//    println(name)
//    print("$age1+$age2")

//    val name = "sekhar"
//    val age1 = 30
//    val age2 = 30
//    val distance = 30.2
//    println("$name${age1 + age2 + distance}") {  string + int(Anything) concatenation)
////
//    println("$age1${name + (age2 + distance)}") {Numeric Addition}
//
//    val salary = 1000.0
//    val advance = 500.0
//    println("Company:" + ( salary + advance ))
//}

//fun main() {
//    val num="100"
//    println(num.toInt())
//    val numb=100
//    println(num.toDouble())
//
//    val number=100.0
//    println(number.toFloat())
//    println(number.toString())
//    println(number.toInt())
////    println(number.toDouble())
//}


fun main(args: Array<String>) {
val array1 = arrayOf(1,2,3,4)
val array2 = arrayOf<Long>(11,12,13,14)
    array1.set(0,5)
    array1[2] = 6

    array2.set(2,10)
    array2[3] = 8

    for(element in array1){
println(element)
    }
    println("")
println()
    for(element in array2){
println(element)
    }
}



