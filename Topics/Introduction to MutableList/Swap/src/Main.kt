fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    val temp = numbers.first()
    numbers[0] = numbers.last()
    numbers[numbers.lastIndex] = temp
    println(numbers.joinToString(separator = " "))
}