package com.example.realtest

class Book private constructor(val id:Int,val name:String) {

   companion object Bookfactory :IdProvider{
       override fun getId(): Int {
          return 444
       }
          val myBook="new book"
          fun create()=Book(0,"animal farm")
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main(){
    val book = Book.create()

    println("${book.id},${book.name}")
}