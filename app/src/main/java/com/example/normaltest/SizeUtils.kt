/**
 * Author: QiuYaWei
 * CreateDate: 2022/4/13 8:34
 * Description:
 */
package com.example.normaltest

import android.content.Context

object SizeUtils {
    fun dpToPx(context: Context, dp: Float): Float {
        return dp * context.getResources().getDisplayMetrics().density
    }

    fun pxToDp(context: Context, px: Float): Float {
        return px / context.getResources().getDisplayMetrics().density
    }

    fun dpToPxInt(context: Context, dp: Float): Int {
        return (dpToPx(context, dp) + 0.5f).toInt()
    }

    fun pxToDpCeilInt(context: Context, px: Float): Int {
        return (pxToDp(context, px) + 0.5f).toInt()
    }
}