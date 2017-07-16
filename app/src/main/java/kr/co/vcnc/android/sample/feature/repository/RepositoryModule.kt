package kr.co.vcnc.android.sample.feature.repository

import android.app.Activity
import com.trello.rxlifecycle2.android.ActivityEvent
import dagger.Module
import io.reactivex.Observable
import kr.co.vcnc.android.sample.inject.module.ActivityModule

@Module
class RepositoryModule(activity: Activity, lifecycle: Observable<ActivityEvent>) : ActivityModule(activity, lifecycle)