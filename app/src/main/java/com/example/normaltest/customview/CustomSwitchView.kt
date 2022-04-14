/**
 * Author: QiuYaWei
 * CreateDate: 2022/4/13 8:15
 * Description:
 */
package com.example.normaltest.customview

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.util.Log
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import com.example.normaltest.R
import com.example.normaltest.SizeUtils
import java.util.*


class CustomSwitchView(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    private val titles = mutableListOf<String>()
    private val fixedWidth = SizeUtils.dpToPx(context.applicationContext, 100f).toInt()
    private val fixedHeight = SizeUtils.dpToPx(context.applicationContext, 60f).toInt()
    private var selectIndex = 0 //默认选中

    init {
        orientation = HORIZONTAL
        context.obtainStyledAttributes(attrs, R.styleable.CustomSwitchView)?.let { typeArray ->
            typeArray.getTextArray(R.styleable.CustomSwitchView_customSwitch_data)?.forEach {
                titles.add(it.toString())
            }
            updateUi()
        }
    }

    /**
     * 设置数据集合
     * @param data
     */
    fun setData(data: MutableList<String>) {
        titles.clear()
        titles.addAll(data)
        updateUi()
    }


    private fun updateUi() {
        removeAllViews()
        titles.forEach {
            val index = titles.indexOf(it)
            val btn = Button(context, null, 0)
            btn.gravity = Gravity.CENTER
            btn.text = it
            btn.setBackgroundResource(if (index == selectIndex) R.mipmap.switch_checked else android.R.color.transparent)
            btn.layoutParams = LayoutParams(fixedWidth, fixedHeight)
            btn.setTextColor(Color.WHITE)
            btn.textSize = 14f
            btn.setOnClickListener { view ->
                selectIndex = index
                updateUi()
            }
            addView(btn)
        }
        setBackgroundResource(if (titles.size <= 2) R.mipmap.middle_corner_363x123 else R.mipmap.large_swith_bg)
    }

    /**
     * 获取选中的下标
     */
    fun getSelectIndex(): Int {
        return selectIndex
    }
}