package cn.yixg.mykotlintest

import android.graphics.Color
import android.hardware.radio.RadioManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import cn.yixg.mykotlintest.R.id.test
import kotlinx.coroutines.experimental.*

/**
 * Created by Anry on 2018/7/16.
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Thread(Runnable { })-
//        Thread {
//            //Lambda表达式
//
//
//        }
//
//        val view = findViewById<View>(R.id.test)
//        view.setOnClickListener { }
//        view.setOnClickListener { v -> v.setBackgroundColor(Color.RED) }//重写的方法有一个形参的时候

        val job = launch(CommonPool,CoroutineStart.DEFAULT) {//创建一个协程 //第二个参数有默认值，可以不传的
            test()
            delay(10_000)
            runOnUiThread {
                //在主线程中运行的代码
            }
        }
        job.cancel()
        launch(CommonPool) {
            job.join()//join方法被suspend修饰，只能在协程中使用，作用是等待job运行完之后才会执行这个协程
        }
        //第二种协程async
        val async = async(CommonPool, CoroutineStart.LAZY) {//第二参数传LAZY，这个协程直到调用await()方法才会被执行，await()可以拿到这个协程的返回值

            "finish"
        }

//        async.await()//await方法被suspend修饰，只能在协程中调用

        val hello:String
        val world:String

    }

    suspend fun test(){}//被关键字修饰的方法只能在子线程中调用，不能在主线程中运行



}
