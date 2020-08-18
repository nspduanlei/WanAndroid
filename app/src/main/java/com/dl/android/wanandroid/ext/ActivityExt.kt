package com.dl.android.wanandroid.ext

import android.graphics.Color
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentActivity
import com.dl.android.wanandroid.utils.StatusBarUtil
import com.google.android.material.snackbar.Snackbar


fun FragmentActivity.snackBarShow(view: View?, str: String) {
    view?.let { Snackbar.make(it, str, Snackbar.LENGTH_SHORT).show() }
}

fun AppCompatActivity.snackBarShow(view: View?, str: String) {
    view?.let { Snackbar.make(it, str, Snackbar.LENGTH_SHORT).show() }
}

fun AppCompatActivity.setupToolBar(toolbar: Toolbar, action: ActionBar.() -> Unit) {
    toolbar.setTitleTextColor(Color.BLACK)
    setSupportActionBar(toolbar)
    supportActionBar?.run {
        action()
    }
}

fun AppCompatActivity.setLightMode() {
    StatusBarUtil.setLightMode(this)
}



