package com.example.samplestore


import org.junit.Assert.assertEquals
import org.junit.Test

class SecondActivityUnitTest {

    @Test
    fun `test update text successfully`() {
        val inputText = "Texto de prueba"


        val updatedText = if (inputText.isNotEmpty()) inputText else ""

        assertEquals("El texto debería actualizarse correctamente", inputText, updatedText)
    }

    @Test
    fun `test error message when input is empty`() {
        val inputText = ""


        val errorMessage = if (inputText.isEmpty()) "Debe escribirse un valor" else ""

        assertEquals("Debe escribirse un valor", errorMessage)
    }
}

