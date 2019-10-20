package com.charliechristensen.bottomsheettest

import android.view.animation.AccelerateDecelerateInterpolator
import androidx.transition.ChangeBounds
import androidx.transition.TransitionSet

class TestTransition : TransitionSet() {

    init {
        ordering = ORDERING_SEQUENTIAL
        addTransition(ChangeBounds())
        interpolator = AccelerateDecelerateInterpolator()
//        addTransition(Slide(Gravity.START))
    }

}