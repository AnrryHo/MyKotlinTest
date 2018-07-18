//package cn.yixg.mykotlintest
//
///**
// * Created by Anry on 2018/7/16.
// * 数据类、构造器
// */
//
////数据类
//data class Person(val name:String)
//
//class Animal(){
//  //会有一个默认的构造器，主构造器，在这个例子中主构造器没有形参
//
//    //次构造器，需要返回主构造器
//    constructor(skin:String):this(){
//    }
//}
//
//class Animal2(tall:Int){
//    //会有一个默认的构造器，主构造器，在这个例子中主构造器一个形参
//
//    var skin:String = ""
//    var tall:Int = -1
//    //次构造器，需要返回主构造器
//    constructor(tall:Int,skin: String) : this(tall) {
//        this.skin = skin
//        this.tall = tall
//    }
//    //如果是默认构造器的初始化
//    init {
//        this.tall=tall
//    }
//}
//
//fun main(args: Array<String>) {
//    val person = Person("")
//    val animal = Animal()//默认的构造器
//}