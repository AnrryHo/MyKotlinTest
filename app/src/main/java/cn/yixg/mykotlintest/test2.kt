//package cn.yixg.mykotlintest
//
///**
// * Created by Anry on 2018/7/14.
// * 基础语法1_集合、扩展函数、扩展属性、vararg、infix、析构声明
// */
//
//fun test( i:Int = 1,j:String = "") {}
//
//fun test(i:Int = 1){
//    var j:String = ""
//}
//
//fun test(vararg item: Int) {//可变的长度
//    item.forEach { print(it)}
//}
//
////拓展函数
//inline fun String.with(){
//
//}
////拓展属性
//inline val String.lastChar :Char
//    get() = get(length-1)//后面的get方法是String的get方法
//
////中缀的定义，在A上面拓展了be方法，传入了B类型的参数，返回Pair.
//infix fun <A, B> A.be(that: B): kotlin.Pair<A, B> =Pair(this,that)//this代表A，that代表B
//fun main2(args: Array<String>) {
//
//    //list集合
//    val list = listOf<Int>(1, 2, 3, 4)
//    val last = list.last()
//    print(last)
//
//    //遍历集合
//    list.forEach {
//        print(it)
//    }
//    list.forEach { item ->
//        print(item)
//    }
//    for (i in list) {
//        print(i)
//    }
//    list.forEachIndexed { index, i -> print("index:${index},i:${i}") }
//
//    list.joinToString()//默认值？
//
//    test(1,2,3)//调用形式参数为可变，的函数
//
//    "".with()
//
//
//    val map = mapOf("a" to 1,"b" to 2)
//    print(map.get("a"))
//    //中缀调用，infix
//    "c" to 3
//    "d".to(4)
//    "e".be(5)
//    "f" be 6
//    val pair = "h" be 7
//    val(key,value) = "g" be 8//析构函数
//    val (group,name,version) = "com.android.support.test.espresso:espresso-core:3.0.2".split(":")//析构函数
//
//
//}