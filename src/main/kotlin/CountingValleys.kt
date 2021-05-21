fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)

}


fun countingValleys(steps: Int, path: String): Int {
    // Write your code here

    var countOfValley = 0
    var previousValue = 0
    var result = 0

    path.forEach {
        if (it == 'D') {
            countOfValley--
        } else if (it == 'U') {
            countOfValley++
        }

        if (previousValue == 0 && countOfValley < 0) {
            result++
        }
        previousValue = countOfValley

    }

    return result
}