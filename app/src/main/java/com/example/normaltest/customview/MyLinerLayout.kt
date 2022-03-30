/**
 * Author: QiuYaWei
 * CreateDate: 2022/3/28 16:26
 * Description:
 */
package com.example.normaltest.customview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.LinearLayout

class MyLinerLayout(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    private val mTag = "MyLinerLayout"
    override fun invalidate() {
        super.invalidate()
        Log.i(mTag,"invalidate")
    }
}