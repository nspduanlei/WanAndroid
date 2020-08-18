package com.dl.android.wanandroid.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.dl.android.wanandroid.R
import com.dl.android.wanandroid.databinding.FragmentRegisterBinding

/**
 * @time: 2020/5/15
 * @author: marsLei
 */
class RegisterFragment : Fragment() {

    lateinit var mBinding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_register, container,
            false)
        mBinding.title = "LoginFragment"

        return mBinding.root
    }
}