package com.dl.android.wanandroid.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.dl.android.wanandroid.R
import com.dl.android.wanandroid.databinding.FragmentLoginBinding
import com.dl.android.wanandroid.databinding.FragmentSettingBinding

/**
 * @time: 2020/5/15
 * @author: marsLei
 */
class LoginFragment : Fragment() {

    lateinit var mBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container,
            false)
        mBinding.title = "LoginFragment"

        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mBinding.btnRegister.setOnClickListener {
            //调整传递参数
            val bundle = Bundle()
            bundle.putString("name", "testArgument")
            val container = Navigation.findNavController(it)
            container.navigate(R.id.action_loginFragment_to_registerFragment, bundle)
        }

        mBinding.btnLogin.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_mainActivity)
            activity?.finish()
        }
    }
}