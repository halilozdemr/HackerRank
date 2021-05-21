fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    var count = 0

    val map = ar.groupingBy { it }.eachCount()
    map.values.filter { i -> i > 1 }.forEach {
        count += it / 2
    }

    return count


}
