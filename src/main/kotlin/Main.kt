fun main() {
    println("был(а) " + agoToText(18000))
}

fun agoToText(time: Int): String{

    val minutesToString = (time/60).toString();
    val hoursToString = (time/3600).toString();
    val activeTime: String
    when(time){

        in 1..60 -> activeTime = "только что"
        in 61..60 * 59 ->  activeTime =  getFormMinutes(time / 60, minutesToString) + " назад"
        else -> activeTime = getFormHours (time / 3600, hoursToString) + " назад"
    }
    return activeTime
}

fun getFormMinutes(minutes: Int, minutesToString: String) = when(minutes){

    1, 21, 31, 41, 51 -> minutesToString + " минуту"
    2, 3, 4, 22, 32, 42, 52 -> minutesToString + " минуты"
    else -> minutesToString + " минут"
}

fun getFormHours(hours: Int, hoursToString: String) = when(hours) {
    1, 21 -> hoursToString + " час"
    2, 3, 4, 22, 23, 24 -> hoursToString + " часа"
    else -> hoursToString + " часов"
}
