package com.example.realtest

//1.Lambda
//람다식은 우리가 마치 value 처럼 다룰 수 있는 익명 함수이다.
//1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a:Int)
//2) return 값으로 사용할 수가 있다.

// 람다의 기본정의
    //val lamdaName : Type={argumentList ->codeBody}

val square : (Int) -> (Int)={number:Int ->number*number}

val nameAge={name:String,Age:Int->"my name is ${name} i'm ${Age}"}

fun main(){
        println(square(12))
        println(nameAge("changhyeonjeon",21))
        val a="changhyeon said"
        val b="mac said"
        println(a.macisBest())
        println(b.macisBest())

        println(extendString("ariana",21))

        val lamda={number:Double->
                number==4.3212
        }

        println(invokeLamda(lamda))
        println(invokeLamda({it>3.214})) // fun의 마지막 파라미터가 람다식일 경우 ()를 생략 가능

        println(invokeLamda{it>3.14})
}

// 확장함수

val macisBest : String.()->String={
        this +" "+ "mac is the best laptop"
}

fun extendString(name : String, age :Int):String{
        val introduceMyself : String.(Int)->String={"i am ${this} and ${age} years old"}
        return name.introduceMyself(age)
}

//람다의 Return

val calculateGrade : (Int) -> String={
        when(it){
                in 0..40 ->"fail"
                in 41..70 -> "pass"
                in 71..100 -> "great"
                else -> "error"
        }

}

//람다를 표현하는 여러가지 방법
fun invokeLamda(lamda:(Double)->(Boolean)):Boolean{
        return lamda(5.2743)
}

