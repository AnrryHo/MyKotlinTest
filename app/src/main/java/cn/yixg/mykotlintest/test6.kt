//package cn.yixg.mykotlintest
//
//import android.graphics.Color
//import android.view.View
//
///**
// * Created by Anry on 2018/7/16.
// *
// */
//class Person{
//    val aa: String = ""
//
//    //嵌套类
//    class Funtune {
//
//        fun test(){
////            aa//嵌套类访问不了Person的成员属性
//        }
//
//    }
//
//    //
//    inner class Sex{
//        fun test(){
//            aa//内部类可以访问Person的成员属性
//        }
//    }
//
//    //伴生类，每个类只有一个伴生类
//    companion object A{
//        fun show(){}
//    }
//
//
//}
//
////kotlin是没有静态的，类似静态可以用关键字object
//object Dialog{
//    fun show(){}
//}
//
//abstract class Pen{
//    abstract fun test()
//
//}
//
//fun main(args: Array<String>) {
//    Dialog.show()//类似静态的调用
////    Person.Companion.show()//伴生类的调用，伴生类没有名字的话这样子调用
//    Person.A.show()//伴生类的调用，伴生类有名字的话这样子调用
//
//    //匿名内部类,object:
//    val pen = object : Pen() {
//        override fun test() {
//        }
//    }
//    pen.test()
//
//    //若接口OnClickListener中只有一个需要实现的方法如onClick，那么可以入下面这样子写，还可以用it代表形参
//    val listener =View.OnClickListener{
//        it.setBackgroundColor(Color.RED)
//
//    }
//
//}