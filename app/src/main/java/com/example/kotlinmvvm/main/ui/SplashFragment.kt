package com.example.kotlinmvvm.main.ui

import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.baselib.base.BaseFragment
import com.example.baselib.extension.countDown
import com.example.baselib.impl.NoMultiClickListener
import com.example.baselib.utils.LogUtil
import com.example.kotlinmvvm.BR
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.databinding.FragmentSplashBinding
import com.example.kotlinmvvm.main.model.SplashViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel

/**
 *Author: shenfei
 *Time: 2024/5/20
 */
class SplashFragment :
    BaseFragment<SplashViewModel, FragmentSplashBinding>(R.layout.fragment_splash,BR.mSplashViewModel) {
    private var mCountDownJob: CoroutineScope? = null
    private lateinit var tvCountDown: TextView
    private lateinit var navController : NavController
    override fun initData() {
        super.initData()
        navController = findNavController()
        val second3 = 3
        tvCountDown = binding.tvCountDown
        this.countDown(time = second3, start = {
            tvCountDown.setText("跳过 $second3 秒")
            mCountDownJob = it
        }, end = {
            LogUtil.i("SplashActivity", "倒计时结束了")
            //正式项目里需要判断用户是否已登录 TODO
//            navController.navigate(R.id.loginFragment)
            val action = SplashFragmentDirections.actionSplashFragmentToLoginFragment()
            navController.navigate(action)
        }, next = {
            LogUtil.i("SplashActivity", "剩余 $it 秒")
            tvCountDown.setText("跳过 ${it - 1} 秒")

        }, error = {

        })
    }

    override fun initEvent() {
        tvCountDown.setOnClickListener(NoMultiClickListener{
            val action = SplashFragmentDirections.actionSplashFragmentToLoginFragment()
            navController.navigate(action)
        })
    }

    override fun onDestroy() {
        mCountDownJob?.let {
            it.cancel()
        }
        super.onDestroy()
    }
}