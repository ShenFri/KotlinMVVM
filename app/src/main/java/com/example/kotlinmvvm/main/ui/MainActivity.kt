package com.example.kotlinmvvm.main.ui

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.baselib.base.BaseActivity
import com.example.kotlinmvvm.BR
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.databinding.ActivityMainNavBinding
import com.example.kotlinmvvm.main.model.MainViewModel

/**
 * @Author shenfei
 * @Date 2024/10/9
 * @Description
 */
class MainActivity :
    BaseActivity<MainViewModel, ActivityMainNavBinding>(R.layout.activity_main_nav, BR.mMainViewModel) {

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
        val navController =findNavController(R.id.main_nav_host_fragment)
        binding.bottomNavigation.setupWithNavController(navController)
    }
}