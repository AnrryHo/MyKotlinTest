package cn.yixg.mykotlintest

/**
 * Created by Anry on 2018/7/17.
 * 注解与反射
 */
@Target(AnnotationTarget.CLASS,AnnotationTarget.FIELD, AnnotationTarget.FUNCTION)
annotation class path{}

@path class Person(val s:String){}

@path fun test(){}
@path var s:String?=""



//反射
fun main(args: Array<String>) {
    //得到字节码文件的两种方式
    val clazz = Person::class.java
    val clazz2=String.javaClass
    //得到了之后就可用字节码文件的方法了
//    clazz.getDeclaredField("s")

    val list = arrayListOf<Int>(1,2,3,4)
    list.forEach(::println)//这样会打印每一个值，println只接收一个参数
    val p = ::s//拿到s的引用
    p.get()//调用引用的方法
    p.set("123")

    //拿到类上面的属性
    val d = Person::s
    //获得属性在对象上面的值
    d.get(Person("23"))


}
