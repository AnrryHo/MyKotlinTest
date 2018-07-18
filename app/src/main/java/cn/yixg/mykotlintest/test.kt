//package cn.yixg.mykotlintest
//
///**
// * Created by Anry on 2018/7/14.
// * 基础语法_函数、变量、类、枚举与控制流
// */
//
//var name :Int = 1//定义一个变量,val是可以修改值的
////三种函数
//fun test() = true
//fun test( value:Int){
//    name = value
//}
//fun test( value:Int,set:Boolean):Int{
//    name = value
//    return 2
//
//}
////不能改变值的变量定义
//val age :Int = 0//val相当于final
//fun main(args: Array<String>):Int {
//    println("i:${age}")//${}是重载符，里面是一个变量符
//    test()
//    test(33)
//    val person :Person = Person("張三",null)
//    person.set(true)
//    person.isMarried//get方法
//    //类似java的switch
//    when(Color.RED){
//        Color.RED-> println("1")
//        Color.Green-> println("2")
//    }
//    when{//可以当做if..else if用了
//        1+1==3->println("1")
//        else -> println("2")
//    }
//    //for循环
//    var range = 0..10
//    loop@ for (i in range) {
//        println(i)
//        if (i == 6) {
//            break
//        }
//        if (i == 3) {
//            continue@loop
//        }
//    }
//
//    return 1
//}
//class Person(val name:String,val age:Int?){//类
//     var isMarried:Boolean = false//变量
//    get() = true
//    fun set(value :Boolean){//变量的set方法
//        isMarried = value
//    }
//}
//
////枚举，enum是软关键字，只有跟class搭配才能算是关键字
//enum class Color( var r: Int, var g: Int, var b: Int){
//    RED(255,0,0),
//    Green(0,255,0),
//    BLUE(0,0,255);//如果下面有函数就需要分号，这可能是kotlin唯一需要分号的地方了
//
//}
//
//
