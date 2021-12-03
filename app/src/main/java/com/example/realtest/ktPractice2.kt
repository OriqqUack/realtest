package com.example.realtest

//4.조건식

fun main(){
forAndWhile()
}

/*
4.조건식
fun maxBy2(a:Int,b:Int):Int=if(a>b)a else b

fun checkNum(score:Int){
    when(score){
        0-> println("this is 0")
        1->println("this is 1")
        2,3->println("this is 2 or 3")
        else->println("i dont know")
    }

    var b:Int=when(score){
        1->1
        2->2
        else->3
    }

    println("b:${b}")

    when(score){
        in 90..100->println("You are genius")
        in 10..80->println("not bad")
        else->println("Okay");
    }
*/



//Expression vs Statement
//코틀린의 모든 함수는 expression으로 반환형이 항상 있다.
//java는 void로 반환하지 않는 함수도 존재하기에 statement가 쓰인다.

//5. Array and List

//Array (Mutable)

//List 1.List 2.MutableList

fun array(){
    val array= arrayOf(1,2,3)
    val list=listOf(1,2,3)

    val array2= arrayOf(1,"d",3.4f)
    val list2= listOf(1,"D",11L)

    array[0]=3
    //list[0]=2 컴파일 에러

    var arrayList= arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

    //list는 배열이 순차적으로 쌓이기에 데이터를 빈틈없이 적재 할 수 있다,
    //array는 데이터를 추가하거나 제거를 할 수 있는 장점이 있다.list는 안됨.
}

// 6.For/while

fun forAndWhile() {

    val students = arrayListOf("joyce", "james", "jenny")

    for (nmae in students) {
        println("${nmae}")
    }

    var sum:Int=0
    for(i in 1 until 100){ //1..100과는 다른점은 100은 포함하지 않는것.
        sum+=i

    }
    println(sum)

    var index=0
    for((index:Int,name:String)in students.withIndex()){
        println("${index+1}번째 학생: ${name}")
    }
    while (index<=10){
        println("current index: ${index}")
        index++
    }
}



































































