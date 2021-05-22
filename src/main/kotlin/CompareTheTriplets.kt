fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}


fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    // Write your code here

    var alice = 0
    var bob = 0

    for (i in a.indices) {
        if (a[i] != b[i]) {
            if (a[i] > b[i]) alice++ else bob++
        }
    }
    return arrayOf(alice, bob)
}
