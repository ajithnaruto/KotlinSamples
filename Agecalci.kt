import java.util.*
fun main(args:Array<String>) {
    var dat:Int = 0
    val mont: Int?
    val yea: Int?
    print("Enter your birth Day")
    val day: Int = readLine()!!.toInt()
    print("Enter your birth Month")
    val month: Int = readLine()!!.toInt()
    print("Enter your birth Year")
    val year: Int = readLine()!!.toInt()
    val dt: Int = Calendar.getInstance().get(Calendar.DATE)
    val mon: Int = Calendar.getInstance().get(Calendar.MONTH)
    val yr: Int = Calendar.getInstance().get(Calendar.YEAR)
    if (dt > day) {
        dat = dt - day
    } else {
        if (month == 2) {
            if (year % 4 == 0) {
                dat = (dt + 29) - day
            } else {
                dat = (dt + 28) - day
            }
        }
        if (month < 7) {
            if (month % 2 == 1) {
                dat = (dt + 31) - day
            } else {
                dat = (dt + 30) - day
            }
        } else if (month > 7) {
            if (month % 2 == 1) {
                dat = (dt + 30) - day
            } else {
                dat = (dt + 31) - day
            }
        }
    }
    if (mon > month) {
        mont = mon - month
    } else {
        mont = (mon + 12) - month
    }
    yea = yr - year
    print("You are $dat days $mont months $yea years old")
}