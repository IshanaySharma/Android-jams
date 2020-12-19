
/*
//Question 7 and 8
    fun main(){
    println("Enter a number")
    val number= readLine()!!.toInt()
    var result=1
    var sum=0
    for(i in 1..number){
        result*=i
        sum+=result
    }
    println("The factorial of the number is $result and sum is $sum")
}

//Question 9

fun main(){
    println("Enter the last number till which sum of even numbers is to be calculated:")
    val num= readLine()!!.toInt()
    var sum=0
    for (i in 1..(num-1)){
        if (i % 2 == 0) sum += i
    }
    println("The sum of the even numbers is $sum")
}

//Question 10
fun main() {
    println("Enter the height:")
    val height = readLine()!!.toInt()
    for (i in 1..height) {
        for (j in 1..i) {
            print("# ")
        }
        println()
    }
}

 */

//Question 11
import kotlin.math.pow

fun main(){
    val num = readLine()!!.toString()
    var originalValue = num
    var sum=0.0
    var digitsArray=originalValue.toString().chunked(size=1)
    for(i in digitsArray){
        sum+=Math.pow(i.toDouble(),3.0)
    }
    var intSum=sum.toInt()
    if(intSum==num.toInt()) println("$intSum is an Armstrong number")
    else println("$intSum is not an Armstrong number")
}


