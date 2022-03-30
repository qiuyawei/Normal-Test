package com.example.normaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    private lateinit var button1: AppCompatButton
    private lateinit var button2: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.myBtn1)
        button2 = findViewById(R.id.myBtn2)

        /**
         * 测试下局部更新，局部更新不会导致整体的UI重新绘制
         */
        button1.setOnClickListener {
            button2.text = "改变了内容改变了内容改变了内容改变了内容改变了内容改变了内容改变了内容改变了内容改变了内容改变了内容"
        }
    }

    /**
     * 测试string
     */
    private fun testStringAddress(){
        val a = "123"
        val b = "123"
    }
}