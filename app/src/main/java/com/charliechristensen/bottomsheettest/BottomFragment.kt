package com.charliechristensen.bottomsheettest

import android.animation.LayoutTransition
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomFragment : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rootView = view.rootView as ViewGroup
        rootView.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        rootView.layoutTransition.enableTransitionType(LayoutTransition.CHANGE_APPEARING)
        rootView.layoutTransition.enableTransitionType(LayoutTransition.CHANGE_DISAPPEARING)
        rootView.layoutTransition.enableTransitionType(LayoutTransition.APPEARING)
        rootView.layoutTransition.enableTransitionType(LayoutTransition.DISAPPEARING)
//        bottomSheetNavHost.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
    }
}