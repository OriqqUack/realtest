package com.example.realtest

fun main(){
    nullcheck()
}

//7.Nullalbe / nonNull

fun nullcheck(){
    //NPE: Null pointer Exception

    var name="joyce"

    var nullName: String? =null

    var nameInUpperCase:String=name.toUpperCase()

    var nullNameInUpperCase: String? =nullName?.toUpperCase()

    // ?:

    val lastName: String? =null

    val fullName = name+ (lastName?:"No lastName")

    println(fullName)

}
//!!
fun ingnoreNull(Str:String){

    val mNotnull: String=Str!!
    val upper:String = mNotnull.toUpperCase()


}


