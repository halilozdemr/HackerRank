import kotlin.math.pow

fun main(args: Array<String>) {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val result = repeatedString(s, n)

    println(result)

}

fun repeatedString(s: String, n: Long): Long {
    if (s.length == 1 && s.contains('a')) return n
    else if (!s.contains('a')) return 0
    else if (s.isEmpty() || s.length > 100) return 0
    else if (n < 1 || n > 10.0.pow(12.0)) return 0

    val list = s.toCharArray().toList()
    val times = n / list.size
    val mode = n % list.size

    val frequency = list.filter { c -> c == 'a' }.size
    val frequencyMode = list.subList(0, mode.toInt()).filter { c -> c == 'a' }.size

    return ((frequency * times) + frequencyMode)
}
