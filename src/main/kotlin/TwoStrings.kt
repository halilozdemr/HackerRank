fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s1 = readLine()!!

        val s2 = readLine()!!

        val result = twoStrings(s1, s2)

        println(result)
    }
}

fun twoStrings(s1: String, s2: String): String {
    val s1Map = s1.groupBy { it }
    val s2Map = s2.groupBy { it }

    s2Map.keys.forEach {
        if (s1Map.containsKey(it)) {
            return "YES"
        }
    }
    return "NO"
}
