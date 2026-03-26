package lesson3

fun main() {
    val secret = "пес"
    var input: String

    do {
        print("Введите пароль: ")
        input = readln()
        if (input != secret) println("Неверно")
    } while (input != secret)

    println("Добро пожаловать!")
}