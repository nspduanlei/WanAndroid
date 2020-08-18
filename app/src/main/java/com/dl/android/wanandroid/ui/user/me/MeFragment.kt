package com.dl.android.wanandroid.ui.user.me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.dl.android.wanandroid.R
import com.dl.android.wanandroid.databinding.FragmentMeBinding

class MeFragment : Fragment() {

    lateinit var mBinding: FragmentMeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_me, container,
            false)
        mBinding.title = "MeFragment"

        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mBinding.btnLogin.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.action)
        }
    }
}