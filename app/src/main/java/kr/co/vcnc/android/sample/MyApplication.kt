package kr.co.vcnc.android.sample

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

class MyApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(base)
    }
    override fun onCreate() {
        super.onCreate()
    }
}