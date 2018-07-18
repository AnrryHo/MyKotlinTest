//package cn.yixg.mykotlintest
//
///**
// * Created by Anry on 2018/7/14.
// * Kotlin基础语法2字符串、正则表达式、null安全与本地函数
// */
//
//
//
//
//
////kotlin的null处理
//fun strTest(str: String?) {
////    str.substring(2)//这样不被允许，因为str有可能为null
//    str?.substring(2)//这样只会在str不为null的时候调用substring方法
//    str!!.substring(2)//这样可以强行调用，但是不安全
//
//}
//
//class Person(val name:String?,val cloth:String?,val handsome:String?)
//
//fun main(args: Array<String>) {
//
//    val str = "xxx/xxx/build.gradle"
//    //返回build.gradle
//    str.substringAfterLast("/")
//    //返回xxx/xxx
//    str.substringBeforeLast("/")
//
//    //正则表达式
//    val r1 = "(.+)/(.+)\\.(.+)"//任意字符.任意字符
//    val regex = r1.toRegex()
//    val matchEntire = regex.matchEntire(str)
//    if (null != matchEntire) {
//        val toList = matchEntire.destructured.toList()
//    }
//    //正则表达式也可以写在6个引号里面""""""
//    val s = """(.+)/(.+)\.(.+) """//不需要转义了
//
//}
////本地方法
//fun Person.save(){
//    if (name == null || name.isEmpty()) {
//        //保存失敗
//    }
//    //其它属性也要判空的话，那代码就会很冗余
//
//    fun check(str: String?):Boolean {
//        return str ==null || str.isEmpty()
//    }
//    check(name)
//    check(handsome)
//    check(cloth)
//
//}