package repository

import entity.FullParameters
import entity.HttpResponse
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

abstract class BaseRepository {
    fun execute(fullParameters: FullParameters): HttpResponse {
        val url = URL(fullParameters.url + getQuery(fullParameters.parameters))

        val conn = url.openConnection() as HttpURLConnection
        conn.apply {
            readTimeout = 100000
            connectTimeout = 120000
            requestMethod = fullParameters.method.toString()
            setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
            setRequestProperty("charset", "utf-8")
            useCaches = false
            connect()
        }

        return when (conn.responseCode) {
            404 -> HttpResponse(conn.responseCode, "")
            else -> HttpResponse(conn.responseCode, conn.inputStream.bufferedReader().use {
                it.readText()
            })
        }
    }

    private fun getQuery(parameters: Map<String, String>) = if (parameters.isEmpty()) "" else parameters.map {
        "${URLEncoder.encode(it.key, StandardCharsets.UTF_8.name())}=${URLEncoder.encode(it.value, StandardCharsets.UTF_8.name())}"
    }.joinToString(prefix = "?", separator = "&")
}
