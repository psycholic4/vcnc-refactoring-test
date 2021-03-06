package kr.co.vcnc.android.sample

import android.app.Application
import android.content.Context
import android.os.Handler
import android.os.HandlerThread
import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication
import kr.co.vcnc.android.sample.inject.ApplicationComponent
import kr.co.vcnc.android.sample.inject.DaggerApplicationComponent
import kr.co.vcnc.android.sample.inject.module.ApplicationModule

class MyApplication : MultiDexApplication() {
    companion object {
        //platformStatic allow access it from java code
        @JvmStatic lateinit var applicationComponent: ApplicationComponent
        @JvmStatic lateinit var fontsHandler: Handler
    }

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()

        val handlerThread = HandlerThread("fonts")
        handlerThread.start()
        fontsHandler = Handler(handlerThread.looper)
    }
}