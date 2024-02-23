fun getDate(year: Int, totalDays: Int): String {
    val year = year
    var startMonth = 1
    var daysInMonth = 0;
    var rimanderDays = totalDays
    var days = 0;

    while (true) {
        daysInMonth = daysInMonth(year, startMonth)
        if (rimanderDays > daysInMonth) {
            rimanderDays -= daysInMonth
            startMonth++
        } else {
            days = rimanderDays
            break
        }
    }
    return "date for [$totalDays] : $days/$startMonth/$year"
}