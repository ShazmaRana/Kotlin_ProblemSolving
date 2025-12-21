import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here

    var countpositive =0
    var countnegative =0
    var countzeros =0
    for(i in arr.indices){
        if(arr[i]>0){
            countpositive++
        }
        if(arr[i]<0){
            countnegative++
        }
        if(arr[i]==0){
            countzeros++
        }
    }

    var positiveratio :Double = countpositive.toDouble()/arr.size
    var negativeratio: Double = countnegative.toDouble()/arr.size
    var zerosratio : Double = countzeros.toDouble()/arr.size


// Format the Double to a string with exactly 6 decimal places
// "%.6f" specifies a floating-point number with 6 digits after the decimal point
    val formattedpositiveratio = String.format(Locale.US , "%.6f" , positiveratio)
    val fomattednegativeratio = String.format(Locale.US , "%.6f" , negativeratio)
    val formattedzeroratio = String.format(Locale.US , "%.6f" , zerosratio)

    println(formattedpositiveratio)
    println(fomattednegativeratio)
    println(formattedzeroratio)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
