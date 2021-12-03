package com.example.realtest


open class Human(name:String="changhyeon"){

    init{
        println("클래스가 호출 될때마다 이것도 같이 실행됨")
    }


    val name:String=name

    fun eatingCake(){
        println("This is so yummy")
    }

    open fun singasong(){

        println("lalala")
    }
}

class Korean :Human(){
    override fun singasong(){
        super.singasong()
        println("라라랄")
    }

}

fun main(){

    val korean=Korean()


    korean.singasong()
}