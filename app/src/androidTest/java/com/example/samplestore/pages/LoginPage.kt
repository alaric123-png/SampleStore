package com.example.samplestore.pages


import com.example.samplestore.utils.EspressoHelper
import com.example.samplestore.R

object LoginPage {

    fun enterUsername(username: String) {
        EspressoHelper.enterTextById(R.id.username, username)
    }

    fun enterPassword(password: String) {
        EspressoHelper.enterTextById(R.id.password, password)
    }

    fun clickLoginButton() {
        EspressoHelper.clickButtonById(R.id.login_button)
    }

    fun verifyLoginErrorDisplayed() {
        EspressoHelper.verifyViewDisplayed(R.id.error_message)
    }

}
