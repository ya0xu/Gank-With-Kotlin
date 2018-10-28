package com.winton.gank.gank.ui.fragment

import android.os.Bundle
import com.winton.gank.gank.R
import com.winton.gank.gank.databinding.FragMeBinding
import com.winton.gank.gank.ui.BaseFragment
import com.winton.gank.gank.utils.BindingUtils
import com.winton.gank.gank.utils.glide.GlideApp

/**
 * @author: winton
 * @time: 2018/10/9 下午7:48
 * @desc: 我的
 */
class MyFragment: BaseFragment<FragMeBinding>() {

    companion object {
        fun newInstance(params: Bundle?):MyFragment{
            var frag = MyFragment()
            params?.apply { frag.arguments = this }
            return frag
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.frag_me
    }

    override fun initData() {
        super.initData()
        BindingUtils.bindGift(binding.imageView, "http://wintonby.github.io/assets/images/winton.jpg")
    }
}