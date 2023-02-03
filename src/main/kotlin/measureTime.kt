fun measureTime(operation: () -> Unit): Long {
    val start = System.currentTimeMillis()
    operation()
    val end = System.currentTimeMillis()
    return end - start
}