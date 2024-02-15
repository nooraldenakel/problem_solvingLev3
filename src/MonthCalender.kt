fun monthDayName(month: Int): String {
    val monthName = listOf(
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    )
    return monthName[month-1]
}

fun printMonthCalendar(year: Int, month: Int) {
    val current = gregorianCalender(1, month, year)
    val numberOfDaysInMonth = daysInMonth(year, month)

    println("----------${monthDayName(month)}-----------")
    print("Sun  Mon  Tue  Wed  The  Fri  Sat\n")
    var index = current
    for (j in 1..current) {
        print("     ")
    }
    for (i in 1..numberOfDaysInMonth) {
        print("$i    ")
        if (++index == 7) {
            index = 0
            println()
        }
    }
    println("\n--------------------------------")
}