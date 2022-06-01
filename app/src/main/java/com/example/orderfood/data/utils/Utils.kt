package com.example.orderfood.data.utils

import android.content.Context
import android.net.ConnectivityManager

object Utils {

    const val FOODS_API_KEY = "a922101d57msh77b2996492f0050p1f985ejsn1e0e02518788"

    @Throws(Exception::class)
    fun mapToQuery(params: MutableMap<String, Any>?): String {
        val sb = StringBuilder()

        params?.entries?.iterator()?.let { it: Iterator<*> ->
            while (it.hasNext()) {
                if (sb.isNotEmpty()) {
                    sb.append('&')
                }
                val (key, value) = it.next() as Map.Entry<*, *>
                sb.append(key).append("=").append(value)
            }
        }
        return sb.toString()
    }

    fun hasInternetConnection(context: Context): Boolean {
        val isConnect: ConnectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        return (isConnect.activeNetworkInfo != null
                && isConnect.activeNetworkInfo!!.isAvailable
                && isConnect.activeNetworkInfo!!.isConnected)
    }

}