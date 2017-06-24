package kr.co.vcnc.android.sample.feature.repository

import dagger.Subcomponent
import kr.co.vcnc.android.sample.inject.ActivityScope

@ActivityScope
@Subcomponent(modules = arrayOf(
        RepositoryModule::class
))
interface RepositoryComponent {
    fun inject(activity: RepositoryListActivity)
}