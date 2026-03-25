package lesson2

fun main() {
    val input = readLine()
    val age = input?.toIntOrNull()
    if (age != null) {
        if (age >= 18) println("Добро пожаловать!")
        else
            println("Вход запрещен")
    }
}