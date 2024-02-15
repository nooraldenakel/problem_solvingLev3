fun daysInYear(year: Int): Int {
    return if (isLeapYear(year))
        366
    else
        365
}

fun hours(year: Int) = daysInYear(year) * 24

fun minutes(year: Int) = hours(year) * 60

fun seconds(year: Int) = minutes(year) * 60
