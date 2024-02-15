fun printYearCalendar(year: Int) {
    println("---------------------\n")
    println("-----------$year----------\n")
    println("---------------------\n")
    for (i in 1..12) {
        printMonthCalendar(year, i)
        println()
    }
}