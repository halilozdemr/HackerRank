fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = first_multiple_input[0].toInt()

    val n = first_multiple_input[1].toInt()

    val magazine = readLine()!!.trimEnd().split(" ").toTypedArray()

    val note = readLine()!!.trimEnd().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val magazineMap = magazine.groupBy { it }
    val noteMap = note.groupBy { it }

    noteMap.keys.forEach {
        if (!magazineMap.containsKey(it)) {
            println("No")
            return
        } else if (magazineMap[it]!!.size < noteMap[it]!!.size) {
            println("No")
            return
        }
    }

    println("Yes")

}

