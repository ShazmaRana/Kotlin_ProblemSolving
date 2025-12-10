import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args:Array<String>){


    val sc = Scanner(System.`in`)
    println("Enter number 1")
    var num1 = sc.nextInt()
    println("Enter number 2")
    var num2 = sc.nextInt()
    val sum = SolveMeFirst(num1 , num2)
    println(sum)
}


fun SolveMeFirst( a : Int ,  b :Int) : Int{
return a+b
}