package com.charliechristensen.bottomsheettest

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.fragment_tall.*

class TallFragment : BaseFragment(R.layout.fragment_tall) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tallButtonOne.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                TallFragmentDirections.actionTallFragmentToExtraSmallFragment()
            )
        }
        tallButtonTwo.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                TallFragmentDirections.actionTallFragmentToMediumFragment()
            )
        }
        tallButtonThree.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                TallFragmentDirections.actionTallFragmentToSmallFragment()
            )
        }
        tallButtonFour.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                TallFragmentDirections.actionTallFragmentToExtraSmallFragment()
            )
        }
        tallButtonFive.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                TallFragmentDirections.actionTallFragmentToExtraSmallFragment()
            )
        }
        tallButtonSix.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                TallFragmentDirections.actionTallFragmentToExtraSmallFragment()
            )
        }
        tallButtonSeven.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                TallFragmentDirections.actionTallFragmentToExtraSmallFragment()
            )
        }
        tallButtonEight.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                TallFragmentDirections.actionTallFragmentToSmallFragment()
            )
        }

    }

}