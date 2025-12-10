

fun main(args : Array<String>){


    val numbers = listOf(1 , 2 ,3 ,4,5)

    numbers.forEach{
        println(it)
    }


    numbers.forEach { number->
        println("Number: $number")
    }

}