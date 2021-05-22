import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}

fun minimumBribes(q: Array<Int>) {
    var bribes = 0
    for (i in q.size - 1 downTo 0) {
        if (q[i] - (i + 1) > 2) {
            println("Too chaotic")
            return
        } else {
            val st = 0.coerceAtLeast(q[i] - 2)
            for (j in st until i) {
                if (q[j] > q[i]) bribes++
            }
        }
    }
    println(bribes)
}
