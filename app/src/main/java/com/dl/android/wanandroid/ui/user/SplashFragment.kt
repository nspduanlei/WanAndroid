package com.dl.android.wanandroid.ui.user

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.dl.android.wanandroid.R
import com.dl.android.wanandroid.databinding.FragmentSplashBinding
import com.dl.android.wanandroid.utils.PreferencesUtil

/**
 * @time: 2020/5/18
 * @author: marsLei
 */

class SplashFragment : Fragment() {
    lateinit var mBinding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container,
            false)
        mBinding.title = "SplashFragment"
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val isLogin = PreferencesUtil.getBoolean("isLogin")

        Handler().postDelayed({
            val container = Navigation.findNavController(view)
            if (isLogin) {
                container.navigate(R.id.action_splashFragment_to_mainActivity)
                activity?.finish()
            } else {
                container.navigate(R.id.action_splashFragment_to_loginFragment)
            }
        }, 3000)
    }

}