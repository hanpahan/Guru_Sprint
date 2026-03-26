fun main() {
    val secretPassword = "пес"
    var userInput: String

    do {
        print("Введите пароль: ")
        userInput = readln()
        if (userInput != secretPassword) {
            println("Неверный пароль. Попробуйте ещё раз.")
        }
    } while (userInput != secretPassword)

    println("Доступ разрешён!")
}