//package cn.yixg.mykotlintest
//
///**
// * Created by Anry on 2018/7/16.
// * 继承类
// */
//open class Person(val aa:String){
//
//   val bb:Int=1
//    fun test(){}
//
//}
////如果要继承，那么被继承的类要被open标注
//class OldPerson : Person("11"){
//
//
//}
//
//val oldPerson:OldPerson = OldPerson()
//val cat:Cat = Cat()
//fun main(args: Array<String>) {
//    oldPerson.test()
//    oldPerson.bb
//    oldPerson.aa
//    cat.aa
//    cat.test()
//}
////用abstract关键字标注
//abstract class Animal{
//     var aa:String =""
//    fun test(){}
//   abstract fun test1()
//}
//class Cat : Animal() {
//    override fun test1() {
//    }
//
//}
//
//
//
