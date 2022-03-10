import java.io.File

fun dayOne() {
    dayOnePart1()
    dayOnePart2()
}

fun dayOnePart1() {

    var increases = 0

    val depth = File("src/main/resources/inputDay1.txt")
        .readLines()
        .map(String::toInt)

    for (i in depth.indices) {
        if (depth[i] == 3) {
            break
        }
        else if (depth[i] < depth[i + 1]) {
            increases++
        }
    }
    println(increases)
}

fun dayOnePart2() {

}
