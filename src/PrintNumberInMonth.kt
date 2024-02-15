fun daysInMonth(year: Int, month: Int): Int {
    if (month < 1 || month > 12)
        return 0
    if (month == 2) {
        return if (isLeapYear(year))
            29
        else
            28
    } else if (month == 4 || month == 6 || month == 9 || month == 11)
        return 30
    return 31
}

fun hours(year: Int, month: Int) = daysInMonth(year, month) * 24

fun minutes(year: Int, month: Int) = hours(year, month) * 60

fun seconds(year: Int, month: Int) = minutes(year, month) * 60