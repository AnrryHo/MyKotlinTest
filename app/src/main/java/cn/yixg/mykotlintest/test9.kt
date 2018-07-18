package cn.yixg.mykotlintest

import android.view.View
import android.widget.Button

/**
 * Created by Anry on 2018/7/17.
 * 高级特性1_lambda、操作符重载与协程
 */


//fun main(args: Array<String>) {
//    //lambda
//    val action={i:String,j:Int/*形参*/->/*方法体*/}//这样action就是方法
//    action("",1)//调用方法
//    val list = arrayListOf(1,2,3,4)
//
//    list.forEach {
//        print(it)
//    }
//    list.forEach {
//        value->//自己规定名字
//        print(value)
//    }
//
//
//    val button:Button?=null
//    val click = {v:View->}
//    button?.setOnClickListener(click)//给setOnClickListener里面传入是View形式参数的方法就好
//
//}


////操作符重载
//class Rmb(var n:Int){
//    operator fun plus(r: Any?) {//operator是关键字
//        print(n  )
//    }
//}
//
//fun main(args: Array<String>) {
//    Rmb(1) + Rmb(1)
//    Rmb(1).plus( Rmb(1))
//    Rmb(1) + 100
//    Rmb(1).plus( 100)
//}
