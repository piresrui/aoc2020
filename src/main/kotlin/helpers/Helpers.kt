package helpers

import java.io.File
import java.lang.RuntimeException
import java.net.URI

internal object Helpers{

    fun getFileResources(fileName: String): List<String> =
        File(getResource(fileName)).readLines()

    fun getFileResourceAsString(fileName: String): String =
        File(getResource(fileName)).readText()

    private fun getResource(file: String): URI =
        Helpers.javaClass.classLoader.getResource(file)?.toURI() ?: throw RuntimeException("Error fetching resource")
}