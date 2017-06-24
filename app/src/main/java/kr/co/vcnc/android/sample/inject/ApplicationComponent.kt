package kr.co.vcnc.android.sample.inject

import android.app.Application
import dagger.Component
import kr.co.vcnc.android.sample.feature.repository.RepositoryComponent
import kr.co.vcnc.android.sample.feature.repository.RepositoryModule
import kr.co.vcnc.android.sample.inject.module.ApplicationModule
import kr.co.vcnc.android.sample.inject.module.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        NetworkModule::class
))
interface ApplicationComponent {
    fun plus(module: RepositoryModule): RepositoryComponent
}