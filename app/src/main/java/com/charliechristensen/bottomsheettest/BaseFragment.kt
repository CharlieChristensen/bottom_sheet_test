package com.charliechristensen.bottomsheettest

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(@LayoutRes layoutId: Int): Fragment(layoutId) {

    val transition by lazy {
//        val changeBounds = ChangeBounds()
//        changeBounds.interpolator = AccelerateDecelerateInterpolator()
//        changeBounds
        TestTransition()
    }
    val rootView by lazy { (parentFragment?.view?.rootView ?: view?.rootView) as? ViewGroup ?: error("No root view available") }

}