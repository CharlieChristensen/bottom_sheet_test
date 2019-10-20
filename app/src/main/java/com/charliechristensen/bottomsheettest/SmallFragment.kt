package com.charliechristensen.bottomsheettest

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.fragment_small.*

class SmallFragment : BaseFragment(R.layout.fragment_small) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        smallButtonOne.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController()
                .navigateRight(SmallFragmentDirections.actionSmallFragmentToExtraSmallFragment())
        }
        smallButtonTwo.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                SmallFragmentDirections.actionSmallFragmentToMediumFragment()
            )
        }
        smallButtonThree.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                SmallFragmentDirections.actionSmallFragmentToMediumFragment()
            )
        }

    }

}