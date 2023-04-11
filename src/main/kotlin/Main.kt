fun main() {
    days("Monday","Tuesday","Wednesday")
    println( division(804,202))
    greeting("Naomi")
    fact("Storm Troopers")
    println(details("Kipchoge",15))
    confirmPresence("Marylynn")
    event("TommorrowLand")
}
//Create a function that takes in 3 strings and creates an array out of them

fun days(day1: String,day2: String,day3: String) {
    var daysOfWeek = arrayOf(day1, day2, day3)
    println(daysOfWeek.contentToString())
}
//Create and invoke a function that given 2 numbers returns the remainder of their division

fun division(num1: Int,num2: Int): Int{
    var remainder = num1/num2
    return remainder
}
//Create and invoke a function that takes in a name and prints out “Hello ${name}”

fun greeting(name: String) {
    var fullGreeting = "Hello ${name}"
    println(fullGreeting)
}

//Create and invoke a function that prints out a statement

fun fact(name: String){
    var funFact = "I love ${name}"
    println(funFact)
}
//Write a function that takes in 2 parameters, name and distance and returns a
//String with this structure “ x ran y kilometers yesterday.” Where x and
//y are the provided name and distance respectively.

fun details(x: String,y: Int): String{
    var detailSummary = "${x} ran ${y} kilometers"
    return detailSummary
}

//Write a function that takes in a name and prints out “Present!” when the person's
//name is passed to it, otherwise it prints out “Absent!"

fun confirmPresence(name: String){
    var myName = "Jacob"
    if (name == myName){
        println("Present")
    }
    else{
        println("Absent")
    }
}

//Write a function that takes in a String and returns its length
fun event(name: String){
    var eventName = name
    println(eventName.length)

}