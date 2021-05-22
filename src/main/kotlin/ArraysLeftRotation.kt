import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))


}

fun rotLeft(a: Array<Int>, d: Int): IntArray {
    val mutableList = a.toMutableList()
    for (i in 0 until d) {
        val tempValue = mutableList.first()
        mutableList.removeAt(0)
        mutableList.add(tempValue)
    }

    return mutableList.toIntArray()
}