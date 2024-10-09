package com.example.kotlinmvvm.main.ui

import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.baselib.base.BaseFragment
import com.example.baselib.impl.NoMultiClickListener
import com.example.kotlinmvvm.BR
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.databinding.FragmentLoginBinding
import com.example.kotlinmvvm.main.model.LoginViewModel

/**
 *Author: shenfei
 *Time: 2024/5/19
 */
class LoginFragment : BaseFragment<LoginViewModel, FragmentLoginBinding>(
    R.layout.fragment_login,
    BR.mLoginViewModel
) {
   private var  navController :NavController = findNavController()
    override fun initEvent() {
        super.initEvent()
        with(binding) {
            btnLookWXArticle.setOnClickListener(NoMultiClickListener {
                navController.navigate(R.id.wxArticleFragment)
            })
        }

        mViewModel.loginLiveData.observe(this) {
//            if (it == null) {
//
//                return@observe
//            }
            val action = MainFragmentDirections.actionMainFragmentSelf("22222")
           navController.navigate(action)
        }
    }

}