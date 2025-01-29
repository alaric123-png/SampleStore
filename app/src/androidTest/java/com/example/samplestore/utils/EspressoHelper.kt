package com.example.samplestore.utils

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*


object EspressoHelper {
    fun enterTextById(viewId: Int, text: String) {
        onView(withId(viewId)).perform(replaceText(text), closeSoftKeyboard())
    }

    fun clickButtonById(viewId: Int) {
        onView(withId(viewId)).perform(click())
    }

    fun verifyViewDisplayed(viewId: Int) {
        onView(withId(viewId)).check(matches(isDisplayed()))
    }

    fun verifyText(viewId: Int, expectedText: String) {
        onView(withId(viewId)).check(matches(withText(expectedText)))
    }

    fun verifyVisibility(viewId: Int, isVisible: Boolean) {
        val visibilityMatcher = if (isVisible) withEffectiveVisibility(Visibility.VISIBLE) else withEffectiveVisibility(Visibility.GONE)
        onView(withId(viewId)).check(matches(visibilityMatcher))
    }


}


