import java.util.LinkedList


fun main(args: Array<String>) {
    val result = makeAnagrams("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke")
    println("result = $result")
}

private fun makeAnagrams(a: String, b: String): Int {

    val groupA = a.toCharArray().groupBy { it }
    val groupB = b.toCharArray().groupBy { it }


    var count = 0
    groupB.filter { groupA.containsKey(it.key) }.forEach {
        groupA[it.key]?.apply {

            count += if (it.value.size > this.size)
                this.size
            else {
                it.value.size
            }

        }
    }

    groupA.filter { groupB.containsKey(it.key) }.forEach {
        groupB[it.key]?.apply {

            count += if (it.value.size > this.size)
                this.size
            else {
                it.value.size
            }

        }
    }


    return   (a.length+b.length)-count
}
