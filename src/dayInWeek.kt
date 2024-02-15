fun gregorianCalender(day: Int, month: Int, year: Int): Int {
    val a = (14 - month) / 12
    val y = year - a
    val m = month + (12 * a) - 2
    return (day + y + (y / 4) - (y / 100) + (y / 400) + ((31 * m) / 12)) % 7
}

fun shortDayName(day: Int): String {
    val arrayOfDay = listOf("Sun", "Mon", "Tue", "Wed", "The", "Fri", "Sat")
    return arrayOfDay[day]
}