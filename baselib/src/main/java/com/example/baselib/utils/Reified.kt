package com.example.baselib.utils

import android.app.Activity
import android.content.Context
import android.content.Intent

/**
 * @Author shenfei
 * @Date 2024/10/9
 * @Description
 */
inline fun <reified T : Activity> Activity.startActivity(context: Context) {
    startActivity(Intent(context, T::class.java))
}
