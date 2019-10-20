package com.charliechristensen.bottomsheettest

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.fragment_extra_small.*

class ExtraSmallFragment : BaseFragment(R.layout.fragment_extra_small) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        extraSmallButtonOne.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                ExtraSmallFragmentDirections.actionExtraSmallFragmentToSmallFragment()
            )
        }
        extraSmallButtonTwo.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                ExtraSmallFragmentDirections.actionExtraSmallFragmentToTallFragment()
            )
        }
    }

}