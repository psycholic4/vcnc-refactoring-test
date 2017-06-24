package kr.co.vcnc.android.sample.inject.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import kr.co.vcnc.android.sample.inject.ForActivity

@Module
open class ActivityModule(val activity: Activity) {

    @Provides
    @ForActivity
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideActivity(): Activity {
        return activity
    }
}