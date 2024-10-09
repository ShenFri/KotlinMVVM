package com.example.kotlinmvvm.main.ui

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.baselib.base.BaseFragment
import com.example.kotlinmvvm.BR
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.databinding.FragmentMainNavBinding
import com.example.kotlinmvvm.main.model.MainViewModel

/**
 * @Author shenfei
 * @Date 2024/10/9
 * @Description
 */
class MainFragment :
    BaseFragment<MainViewModel, FragmentMainNavBinding>(R.layout.fragment_main_nav, BR.mMainViewModel) {

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
        val navController = findNavController()
        binding.bottomNavigation.setupWithNavController(navController)
    }
}