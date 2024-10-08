package com.example.baselib.base

import android.app.Application
import com.tencent.mmkv.MMKV

/**
 *Author: shenfei
 *Time: 2024/2/18 09:36
 */
object BaseLibSDK {
    private lateinit var mContext: Application
    fun init(context: Application) {
        mContext = context
        val rootDir: String = MMKV.initialize(mContext)
        println("mmkv root: $rootDir")
    }

    fun getContext(): Application {
        return mContext
    }
}