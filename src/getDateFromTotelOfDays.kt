fun getDate(year: Int, totalDays: Int): String {
    var startMonth = 1
    var daysInMonth: Int
    var reminder = totalDays
    val days: Int;

    while (true) {
        daysInMonth = daysInMonth(year, startMonth)
        if (reminder > daysInMonth) {
            reminder -= daysInMonth
            startMonth++
        } else {
            days = reminder
            break
        }
    }
    return "date for [$totalDays] : $days/$startMonth/$year"
}