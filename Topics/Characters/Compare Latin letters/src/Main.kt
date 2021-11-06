fun main() {
    val a = readLine()!!.first()
    val b = readLine()!!.first()
    print(a == b || a == b.toUpperCase() || a.toUpperCase() == b)
}
