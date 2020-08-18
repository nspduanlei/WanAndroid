package com.dl.android.wanandroid.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.dl.android.wanandroid.R
import com.dl.android.wanandroid.databinding.FragmentSettingBinding
import com.dl.android.wanandroid.databinding.FragmentSplashBinding

/**
 * @time: 2020/5/15
 * @author: marsLei
 */

class SettingFragment : Fragment() {

    lateinit var mBinding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_setting, container,
            false)
        mBinding.title = "SplashFragment"

        return mBinding.root
    }
}