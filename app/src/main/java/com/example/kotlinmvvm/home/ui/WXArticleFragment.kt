package com.example.kotlinmvvm.home.ui

import com.example.baselib.base.BaseFragment
import com.example.kotlinmvvm.BR
import com.example.kotlinmvvm.R
import com.example.kotlinmvvm.databinding.FragmentWxarticleBinding
import com.example.kotlinmvvm.home.model.WXArticleViewModel

/**
 *Author: shenfei
 *Time: 2024/5/25
 */
class WXArticleFragment : BaseFragment<WXArticleViewModel, FragmentWxarticleBinding>(
    R.layout.fragment_wxarticle,
    BR.mWXArticleViewModel
) {
    override fun loadData() {
        binding.swipeRefresh.isRefreshing = true
        mViewModel.wxArticle()
    }

    override fun initEvent() {
        super.initEvent()
        binding.swipeRefresh.setOnRefreshListener {
            loadData()
        }

        mViewModel.wxArticleLiveData.observe(this) {
            binding.swipeRefresh.isRefreshing = false
        }
    }
}