package com.dl.android.wanandroid.ui

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.dl.android.wanandroid.R
import com.dl.android.wanandroid.ext.setupToolBar
import com.dl.android.wanandroid.utils.PreferencesUtil

/**
 * @time: 2020/5/18
 * @author: marsLei
 */

class LaunchActivity : AppCompatActivity() {

    private lateinit var controller: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        controller = Navigation.findNavController(this, R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this, controller)
    }

    override fun onSupportNavigateUp(): Boolean {
        return controller.navigateUp()
    }
}