fun main(args: Array<String>) {
    task1()
    task2()
    task3()
}

fun task1() {
    println("Task 1")
    println()

    val res = List(100) { it }
        .filter { it % 2 == 0 }
        .slice(10 .. 20)
        .sumOf { it + 1 }

    println(res)
    println()
}

fun task2() {
    println("Task 2")
    println()

    val persons = listOf(
        Person("Ivan", "Petrov", 20),
        Person("Petr", "Ivanov", 23),
        Person("Vasiliy", "Zvetkov", 21),
        Person("Oleg", "Medvedev", 24),
        Person("Anton", "Sinichkin", 22),
        Person("Bogdan", "Grachev", 25),
        Person("Mikhail", "Tabakov", 26),
        Person("Oleg", "Kolobov", 29),
        Person("Yan", "Lenin", 27),
        Person("Fedor", "Rybakov", 28)
    )

    println("sorted by age descending")
    persons.sortByAgeDesc().forEach {
        println(it)
    }
    println()

    println("sorted by fullname")
    persons.sortByFullName().forEach {
        println(it)
    }
    println()
}

fun task3() {
    println("Task 3")
    println()

    var time = measureTime {
        Thread.sleep(234)
    }
    println("time for 234 mills operation")
    println(time)
    println()

    time = measureTime {
        Thread.sleep(765)
    }
    println("time for 765 mills operation")
    println(time)
    println()
}