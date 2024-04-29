package com.putragandad.words

import android.app.Application
import com.putragandad.words.utils.SharedPreferenceManager

class WordsApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        SharedPreferenceManager.init(this)
    }
}