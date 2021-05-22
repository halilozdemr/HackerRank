fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val c = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}

fun jumpingOnClouds(c: Array<Int>): Int {
    var jumpCount = 0
    var index = 0

    do {
        val nextItem = c.elementAtOrElse(index + 1) { -1 }
        val secondItem = c.elementAtOrElse(index + 2) { -1 }
        when {
            secondItem == 0 -> {
                jumpCount++
                index += 2
            }
            nextItem == 0 -> {
                index += 1
                jumpCount++
            }
            else -> index++
        }

    } while (nextItem != -1 && secondItem != -1)

    return jumpCount

}