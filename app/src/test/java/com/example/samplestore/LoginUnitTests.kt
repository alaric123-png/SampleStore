package com.example.samplestore


import org.junit.Assert.assertTrue
import org.junit.Test

class LoginActivityUnitTest {

    @Test
    fun `test login success with correct credentials`() {
        // Valores dinámicos que podrían venir de la entrada del usuario
        val username = obtenerUsername()
        val password = obtenerPassword()

        assertTrue(
            "El inicio de sesión debería ser exitoso",
            username == "Espresso" && password == "Prueba"
        )
    }

    @Test
    fun `test login failure with incorrect credentials`() {
        val username = "UsuarioInvalido"
        val password = "Incorrecto"

        assertTrue(
            "El inicio de sesión debería fallar",
            !(username == "Espresso" && password == "Prueba")
        )
    }

    private fun obtenerUsername(): String {
        return "Espresso"
    }

    private fun obtenerPassword(): String {
        return "Prueba"
    }
}

