data class Person(
    val name: String,
    val surname: String,
    val age: Int
)

fun List<Person>.sortByAgeDesc() = sortedByDescending { it.age }

fun List<Person>.sortByFullName() = sortedBy { "${it.name}${it.surname}" }
