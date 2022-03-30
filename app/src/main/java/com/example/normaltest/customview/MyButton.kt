/**
 * Author: QiuYaWei
 * CreateDate: 2022/3/28 16:28
 * Description:
 */
package com.example.normaltest.customview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.AppCompatButton

class MyButton(context: Context, attrs: AttributeSet?) : AppCompatButton(context, attrs) {
    private val mTag = "MyButton"
    override fun invalidate() {
        super.invalidate()
        Log.i(mTag, "invalidate")
    }
}