package com.example.samplestore.pages

import androidx.appcompat.app.AppCompatActivity
import com.example.samplestore.R
import com.example.samplestore.utils.EspressoHelper


class SecondActPage {
    fun enterText(text: String) {
        EspressoHelper.enterTextById(R.id.editText, text)
    }

    fun clickUpdateButton() {
        EspressoHelper.clickButtonById(R.id.buttonUpdate)
    }

    fun verifyUpdatedText(expectedText: String) {
        EspressoHelper.verifyText(R.id.textView, expectedText)
    }

    fun verifyErrorMessage(expectedError: String) {
        EspressoHelper.verifyText(R.id.errorTextView, expectedError)
        EspressoHelper.verifyVisibility(R.id.errorTextView, true)
    }

    fun verifyErrorHidden() {
        EspressoHelper.verifyVisibility(R.id.errorTextView, false)
    }

}