package com.putragandad.words.utils

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceManager {
    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(Constant.LAYOUT_MODE, Context.MODE_PRIVATE)
    }

    fun saveLayoutMode(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getLayoutMode(key: String, defaultValue: String) : String {
        return sharedPreferences.getString(key, defaultValue) ?: defaultValue
    }
}