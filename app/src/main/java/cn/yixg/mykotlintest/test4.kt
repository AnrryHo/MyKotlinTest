//package cn.yixg.mykotlintest
//
///**
// * Created by Anry on 2018/7/16.
// * lsn2_2_Kotlin基础语法3_接口、类与访问控制
// */
//
//
////接口
//interface onClickListener{
//    val aa :String
//    fun test()
//    fun test2(){//实体方法
//
//    }
//}
//interface onClickListener2{
//    val bb :String
//    fun test2(){
//
//    }
//}
//
////如果要实现的接口中有两个相同名字的实体方法如test2，那么实现的子类必须重写test2
////如果要调用父类的实体方法，要用super，如果要实现的接口中有两个相同名字的实体方法如test2，那么就在<>指定父类
//class Button(override val aa: String, override val bb: String) :onClickListener ,onClickListener2{
//    override fun test2() {
//        super<onClickListener>.test2()
//    }
//
//
//    override fun test() {
//    }
//
//}