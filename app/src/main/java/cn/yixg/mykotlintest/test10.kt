//package cn.yixg.mykotlintest
//
///**
// * Created by Anry on 2018/7/17.
// * 泛型
// *
// */
////in只能消费，out只能生产
//class Person<in T> {
//    fun set(t: T) {}//in标注的泛型只能消费
////    fun get():T{}//报错，不能生产，也就不能够返回T类型
//
//}
//
//class Person2<out T> {
//    //    fun set(t:T){}//报错，out标注的泛型不能消费，也就是不能使用
//    fun get(): T? {
//        var t: T?=null
//        return t
//    }//只能生产，也就能够返回T类型
//
//}
////泛型约束
//fun <T:Number> show(t:T){}
////多种约束where
//interface onClick
//interface onLongClick
//fun <T> hand(t: T) where T :onClick, T :onLongClick{}//T需要同时实现onClick和onLongClick才行
//
//class Sha:onClick,onLongClick{}
//fun main(args: Array<String>) {
//    show(1)//由于泛型约束，所以只能传入Number或者其子类
//
//    hand(Sha())//传入的参数需要同时实现onClick和onLongClick
//}
//
