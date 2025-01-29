package com.example.samplestore.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.samplestore.R
import org.junit.FixMethodOrder
import org.junit.runners.MethodSorters
import com.example.samplestore.SecondActivity
import com.example.samplestore.pages.SecondActPage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class SecondActTests {
    @get:Rule
    var activityRule = ActivityScenarioRule(SecondActivity::class.java)

    private val page = SecondActPage()
    private val context = InstrumentationRegistry.getInstrumentation().targetContext
    private fun generateRandomText(): String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (3..15).random()
            .let { length -> (1..length).map { allowedChars.random() }.joinToString("") }
    }



    @Test
    fun test01_ElementsDisplayed() {
        val helloText = context.getString(R.string.hello_text)
        page.verifyUpdatedText(helloText)
        page.verifyErrorHidden()
    }

    @Test
    fun test02_UpdateFunctionality() {
        val newText = generateRandomText()
        page.enterText(newText)
        page.clickUpdateButton()
        page.verifyUpdatedText(newText)
        page.verifyErrorHidden()
    }

    @Test
    fun test03_EmptyFieldError() {
        val errorText = context.getString(R.string.error_empty_field)
        page.clickUpdateButton()
        page.verifyErrorMessage(errorText)
    }
}

