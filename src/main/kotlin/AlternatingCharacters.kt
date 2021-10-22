/*
 * Complete the 'alternatingCharacters' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s = readLine()!!

        val result = alternatingCharacters(s)

        println(result)
    }
}


fun alternatingCharacters(s: String): Int {
    var count = 0

    for (i in 0 until s.lastIndex) {
        if (s[i] == s[i + 1]) {
            count += 1
        }
    }

    return count
}
