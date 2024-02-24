fun getDateAfterAddMoreDays(year: Int, totalDays: Int): String {
    var currentYear = year
    var startMonth = 1
    var daysInMonth: Int
    var reminder = totalDays
    val days: Int

    while (true) {
        daysInMonth = daysInMonth(currentYear, startMonth)
        if (reminder > daysInMonth) {
            reminder -= daysInMonth
            startMonth++
            if (startMonth == 12)
                currentYear++
        } else {
            days = reminder
            break
        }
    }
    return "date for [$totalDays] : $days/$startMonth/$currentYear"
}