fun totalDayFromBeginningOfYear(day: Int, month: Int, year: Int): Int {
    var counter = 0
    for (i in 1..<month) {
        counter += daysInMonth(year, i)
    }
    counter += day
    return counter
}