package com.example.samplestore.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.samplestore.LoginActivity
import com.example.samplestore.pages.LoginPage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTests {

    @get:Rule
    var activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun testSuccessfulLogin() {

        LoginPage.enterUsername("Espresso")
        LoginPage.enterPassword("Prueba")
        LoginPage.clickLoginButton()

    }

    @Test
    fun testFailedLogin() {

        LoginPage.enterUsername("WrongUser")
        LoginPage.enterPassword("WrongPass")
        LoginPage.clickLoginButton()
        LoginPage.verifyLoginErrorDisplayed()
    }
}



