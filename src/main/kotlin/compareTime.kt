import java.util.*
import java.util.TimeZone

import java.text.SimpleDateFormat




fun main(args: Array<String>) {

    val sdf = SimpleDateFormat("HH:mm")
    sdf.timeZone = TimeZone.getTimeZone("UTC")

    val inputString = "01:30"

    val date: Date = sdf.parse(inputString)
    println("in milliseconds: " + date.time)

}