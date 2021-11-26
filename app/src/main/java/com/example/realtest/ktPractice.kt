package com.example.realtest



    fun main(){

        //3. String templete: &

        val name="changhyeon"
        val lastname:String="jeon"
        println("my name is ${name + lastname}") //띄어쓰기를 조심하자 {}사용.



    }
//1. 함수
    fun add(a:Int,b:Int):Int{
        return a+b;
    }

    fun helloworld(){
        println("Hello World");
    }

//2.val vs var
//val=value 바뀌지 않는 값
//var=variable 바뀔수 있는 값

fun hi(){
    val a:Int=10;
    var b:Int=5;
    //val=5 는 컴파일 에러를 발생한다.
    b=100

    val c=100

    var name="changhyeon"
}



