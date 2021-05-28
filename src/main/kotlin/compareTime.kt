import java.util.*
import java.util.TimeZone

import java.text.SimpleDateFormat




fun main(args: Array<String>) {

    val sdf = SimpleDateFormat("HH:mm")
    sdf.timeZone = TimeZone.getTimeZone("UTC")

    val inputString = "01:30"

    val date: Date = sdf.parse(inputString)
    println("in milliseconds: " + date.time)


    //    val hrsStartTime = 11
//    val hrsEndTime = 12
//
//    val oldStart = 12
//    val oldEnd = 14
//
//    if ((hrsStartTime !in oldStart..oldEnd) && (hrsEndTime !in oldStart..oldEnd)) {
//        println("Allow To Add.")
//    }else{
//        println("Don't Allow To Add.")
//    }

//    if ((hrsStartTime in oldStart..oldEnd) || (hrsEndTime in oldStart..oldEnd)) {
//        println("value of hr is in between oldStart = ${oldStart} and ${hrsStartTime}   and ${oldEnd} and ${hrsEndTime}")
//    } else {
//        println("value of hr is in not between  oldStart = ${oldStart} and ${hrsStartTime}")
//    }




}