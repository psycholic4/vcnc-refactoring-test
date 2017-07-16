package kr.co.vcnc.android.sample.inject.module

import android.app.Activity
import android.content.Context
import com.trello.rxlifecycle2.android.ActivityEvent
import dagger.Module
import dagger.Provides
import io.reactivex.Observable
import kr.co.vcnc.android.sample.inject.ForActivity

@Module
open class ActivityModule(val activity: Activity, val lifecycle: Observable<ActivityEvent>) {

    @Provides
    @ForActivity
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun provideLifecycle(): Observable<ActivityEvent> {
        return lifecycle;
    }
}