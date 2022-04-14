package com.example.normaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.normaltest.customview.CustomSwitchView

class MainActivity : AppCompatActivity() {
    private val titles = mutableListOf(
        "AA","BB","dddddddd"
    )
    private lateinit var customSwitchView: CustomSwitchView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       customSwitchView = findViewById(R.id.customSwitch)
    }

    /**
     * 测试string
     */
    private fun testStringAddress() {
        val a = "123"
        val b = "123"
    }
}