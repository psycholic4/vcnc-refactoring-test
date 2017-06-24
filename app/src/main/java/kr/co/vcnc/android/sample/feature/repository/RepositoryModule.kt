package kr.co.vcnc.android.sample.feature.repository

import android.app.Activity
import dagger.Module
import kr.co.vcnc.android.sample.inject.module.ActivityModule

@Module
class RepositoryModule(activity: Activity) : ActivityModule(activity)