package lesson2
fun main() {
    val AGE_OF_NAJORITY = 18
    print("Введите ваш возраст: ")
    val input = readLine()
    val age = input?.toIntOrNull()
    if (age != null) {
        val isAdult = age >= AGE_OF_NAJORITY
        println("Совершеннолетие достигнуто: $isAdult")
    } else {
        println("Ошибка: введите корректное число.")
    }
}