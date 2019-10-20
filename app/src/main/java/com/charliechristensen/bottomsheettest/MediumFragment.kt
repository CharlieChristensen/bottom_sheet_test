package com.charliechristensen.bottomsheettest

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.fragment_medium.*

class MediumFragment : BaseFragment(R.layout.fragment_medium) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mediumButtonOne.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                MediumFragmentDirections.actionMediumFragmentToSmallFragment()
            )
        }
        mediumButtonTwo.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                MediumFragmentDirections.actionMediumFragmentToTallFragment()
            )
        }
        mediumButtonThree.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                MediumFragmentDirections.actionMediumFragmentToSmallFragment()
            )
        }
        mediumButtonFour.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                MediumFragmentDirections.actionMediumFragmentToTallFragment()
            )
        }
        mediumButtonFive.setOnClickListener {
            TransitionManager.beginDelayedTransition(rootView, transition)
            findNavController().navigateRight(
                MediumFragmentDirections.actionMediumFragmentToSmallFragment()
            )
        }

    }

}