package com.dl.android.wanandroid

import android.app.Application

/**
 * @time: 2020/5/28
 * @author: marsLei
 */
class test : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: test? = null
    }
}