fun main() {
    println(" ЗАДАНИЕ 1")
    print("Введите ваш уровень: ")
    val level = readln().toInt()
    val (status, bonus) = when {
        level < 10 -> Pair("Новичок", 10)
        level < 50 -> Pair("Опытный", 30)
        else -> Pair("Легенда", 100)
    }
    println("$status! Вы получаете +$bonus HP.")
    println("\nЗАДАНИЕ 2")
    print("Введите ваш возраст: ")
    val age = readln().toInt()
    val ageCategory = if (age < 12) {
        "Вы ребёнок"
    } else if (age <= 17) {
        "Вы подросток"
    } else {
        "Вы взрослый"
    }
    println(ageCategory)
    println("\nЗАДАНИЕ 3")
    print("Введите число от 1 до 100: ")
    val number = readln().toInt()
    if (number in 10..50) {
        println("Число $number входит в диапазон от 10 до 50")
    } else {
        println("Число $number НЕ входит в диапазон от 10 до 50")
    }
    println("\nЗАДАНИЕ 4")
    print("Введите один символ: ")
    val char = readln().first()
    val charType = when {
        char in '0'..'9' -> "Цифра"
        char in 'a'..'z' -> "Строчная буква латинского алфавита"
        char in 'A'..'Z' -> "Заглавная буква латинского алфавита"
        char == ' ' -> "Пробел"
        else -> "Спецсимвол"
    }
    println("Символ '$char' - это $charType")
    println("\nЗАДАНИЕ 5")
    val multiplier = 5
    repeat(10) { i ->
        val result = multiplier * (i + 1)
        println("$multiplier × ${i + 1} = $result")
    }
    println("\nЗАДАНИЕ 6")
    val films = listOf("Интерстеллар", "Начало", "Матрица", "Побег из Шоушенка", "Форрест Гамп")
    println("Список фильмов:")
    films.forEach { film ->
        println(" - $film (длина названия: ${film.length} символов)")
    }
    println("\nЗАДАНИЕ 7")
    print("Введите ваше имя: ")
    val name = readln()
    print("Введите ваш возраст: ")
    val userAge = readln().toInt()
    print("Введите ваш любимый цвет: ")
    val color = readln()
    println("Привет, $name! Тебе $userAge ${getAgeWord(userAge)}, и ты любишь $color.")
}
fun getAgeWord(age: Int): String {
    return when {
        age % 10 == 1 && age % 100 != 11 -> "год"
        age % 10 in 2..4 && (age % 100 < 10 || age % 100 >= 20) -> "года"
        else -> "лет"
    }
}