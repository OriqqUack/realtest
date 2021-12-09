package com.example.realtest


data class ticket(val companyName:String,val name:String,val date: String,val seatNumber:Int)

class ticketNormal(val companyName:String,val name:String,val date: String,val seatNumber:Int)
// toString(), hashCode(), equals(), copy()

fun main(){
    val TicketA=ticket("KoreanAir","changhyeon","2020-12-26",15)
    val TicketB=ticketNormal("KoreanAir","changhyeon","2020-12-26",15)

    println(TicketA.companyName)
    println(TicketB)
}