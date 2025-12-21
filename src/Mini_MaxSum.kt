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
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here

    var minelement  =  Long.MAX_VALUE
    var maxelement  = Long.MIN_VALUE
    var totalSum: Long = 0

    for (value in arr) {
        totalSum += value
        minelement = Math.min(minelement, value.toLong())
        maxelement = Math.max(maxelement, value.toLong())

    }

   val maxSum = totalSum - minelement
   val minSum = totalSum - maxelement
    println("$minSum $maxSum")
}
fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
