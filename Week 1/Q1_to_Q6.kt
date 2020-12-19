/*Question 1
fun main() = when (val num = readLine()!!.toInt()){
    0->println("Number is neither positive nor negative")
    else->println("number is ${if (num>0) "positive" else "negative"}")
}

//Question 2
fun largestNumber(num1:Int, num2:Int, num3:Int):Int{
    return when{
        num1>=num2 && num1>=num3->num1
        num2>=num1 && num2>=num3->num2
        else->num3
    }
}
fun main(){
    var num1: Int
    var num2: Int
    var num3: Int

    print("Enter the first number : ")
    num1 = readLine()?.toInt() ?: -1

    print("Enter the second number : ")
    num2 = readLine()?.toInt() ?: -1

    print("Enter the third number : ")
    num3 = readLine()?.toInt() ?: -1

    println("Largest among $num1,$num2 and $num3 is ${largestNumber(num1, num2, num3)}")
}

//Question 3
import kotlin.math.abs
fun main(args : Array<String>){
    println("Enter an number for its absolute value")
    var a=readLine()!!.toInt()
    println("The absolute value of number is ${abs(a)}");
}



//Question 4

fun main(){
    var b=readLine()!!.toInt()
    if (b%5==0 && b%11==0){println("The number is divisible by 5 and 11")}
    else{println("The number is not divisible by 5 and 11")}
}


//Question 5

fun main(){
    println("Enter the length of 1st side:")
    var side1=readLine()!!.toInt()
    println("Enter the length of 2nd side:")
    var side2=readLine()!!.toInt()
    println("Enter the length of 3rd side:")
    var side3=readLine()!!.toInt()

    if(side1==side2 && side2==side3){
        println("The triangle is an equilateral triangle")
    }else if (side1==side2 || side2==side3 || side1==side3){
        println("The triangle is an isosceles triangle")
    }else{
        println("The triangle is a scalene triangle")}
}
*/

//Question 6

fun main(){
    println("Enter a character")
    var i= readLine()!!
    if(i in "a".."z"){println("The inputted character is an alphabet")}
    else println("The inputted character is not an alphabet")
}
