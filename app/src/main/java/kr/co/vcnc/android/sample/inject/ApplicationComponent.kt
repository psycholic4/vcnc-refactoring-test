package kr.co.vcnc.android.sample.inject

import com.google.gson.Gson
import dagger.Component
import kr.co.vcnc.android.sample.database.DatabaseModule
import kr.co.vcnc.android.sample.feature.repository.RepositoryComponent
import kr.co.vcnc.android.sample.feature.repository.RepositoryDetailComponent
import kr.co.vcnc.android.sample.feature.repository.RepositoryDetailModule
import kr.co.vcnc.android.sample.feature.repository.RepositoryModule
import kr.co.vcnc.android.sample.inject.module.ApplicationModule
import kr.co.vcnc.android.sample.inject.module.NetworkModule
import kr.co.vcnc.android.sample.inject.module.SerializationModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        NetworkModule::class,
        SerializationModule::class,
        DatabaseModule::class
))
interface ApplicationComponent {
    fun plus(module: RepositoryModule): RepositoryComponent
    fun plus(module: RepositoryDetailModule): RepositoryDetailComponent

    fun gson(): Gson
}