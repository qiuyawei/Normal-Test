/**
 * Author: QiuYaWei
 * CreateDate: 2022/4/12 9:37
 * Description:
 */
package com.example.normaltest.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class MyView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private val mPaintSelect = Paint(Color.BLUE) //选中画笔
    private val mPaintUnSelect = Paint(Color.TRANSPARENT)//未选中
    private val mPaintBg = Paint(Color.WHITE)
    private val texts = listOf<String>("白色","黑色")
    private val fixedWidth = 200
    private val fixedHeight = 100
    private var selectPosition = 0 //默认选中位置
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }
}