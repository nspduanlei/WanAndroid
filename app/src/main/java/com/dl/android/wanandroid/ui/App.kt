package com.dl.android.wanandroid.ui

import android.app.Application

/**
 * @time: 2020/5/28
 * @author: marsLei
 */

class App : Application() {

    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}