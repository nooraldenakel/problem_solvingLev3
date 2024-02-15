
/*
*
* Check is The Year User entered Is Leap or not
*
* */
fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
}