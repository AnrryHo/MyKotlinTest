//package cn.yixg.mykotlintest
//
//import kotlin.properties.Delegates
//import kotlin.properties.ReadWriteProperty
//import kotlin.reflect.KProperty
//
///**
// * Created by Anry on 2018/7/16.
// * 委托
// */
//
////myList将自己要实现的方法委托给list去实现
//class myList(list:ArrayList<String>):Collection<String> by list
//
//
//fun main(args: Array<String>) {
//    val l1= ArrayList<String>()
//    val l = myList(l1)
//}
//
////将变量name委托，lazy是懒惰的意思，没有用到name的话不会创建，而且只会创建一次
//val name :ArrayList<String> by lazy {
//    ArrayList<String>()
//}
//
////委托中delegate的三种方式
//var psw:String by Delegates.notNull<String>()
//
//var aa:String by Delegates.observable(""){//默认值
//    //这样写和Lambert有关
//    property, oldValue, newValue->
//    print("${property} oldValue:${oldValue} newValue:${newValue} ")
//}
//
//var bb :String by Delegates.vetoable(""){
//    property, oldValue, newValue->
//   false//需要返回值
//}
//
////自定义的委托
//class MyDelegate<T> : ReadWriteProperty<Any?,T>{
//    var t :T?=null//保存
//    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
//        return t ?: throw Exception()
//    }
//
//    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
//        t = value
//    }
//
//}
